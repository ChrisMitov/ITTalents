package music.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Shop implements IShop {
	private static final int CONSTANT_FOR_TIME = 10;
	private static final double WHEN_TO_MAKE_MONHT_SUPPLY = 0.8;
	private static final int IZCHERPANA_NALICHNOST = 0;
	private static final int DEFAULT_QUANTITY = 15;
	private int money;
	private Map<Product, Integer> products = new ConcurrentHashMap<Product, Integer>();
	private ILogShop log;
	private Supplier sup;

	public Shop(int money) {
		for (String productName : new String[] { "Cigulka", "Viola", "Kontrabas" })
			products.put(new Product(productName, ProductType.STRUNNI), DEFAULT_QUANTITY);
		for (String productName : new String[] { "Trompet", "Tuba", "Klarinet" })
			products.put(new Product(productName, ProductType.DUHOVI), DEFAULT_QUANTITY);
		for (String productName : new String[] { "Baraban", "Typan", "Daire" })
			products.put(new Product(productName, ProductType.UDARNI), DEFAULT_QUANTITY);
		for (String productName : new String[] { "Piano", "Organ", "Akordeon" })
			products.put(new Product(productName, ProductType.KLAVISHNI), DEFAULT_QUANTITY);
		for (String productName : new String[] { "Sintezator", "Bas-kitara", "Elektricheska cigulka" })
			products.put(new Product(productName, ProductType.ELEKTRONNI), DEFAULT_QUANTITY);

		this.money = money;
		log = LogShop.getInstance();
		this.sup = new Supplier(this);
	}

	private boolean canIBuyThisProduct(String name, int quantity) {
		for (Product product : products.keySet()) {
			if (product.getName().equals(name)) {
				if (products.get(product) >= quantity) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void sellProduct(String name, int quantity) throws ShopException {
		if (name != null && !name.trim().equals("")) {
			for (Product product : products.keySet()) {
				String productName = product.getName();
				String typeName = product.getType().name();
				if (productName.equalsIgnoreCase(name)) {
					while (!canIBuyThisProduct(productName, quantity)) {
						// Ako e nad koeficienta to e vreme za mesechna dostavka
						if (Math.random() <= WHEN_TO_MAKE_MONHT_SUPPLY) {
							func(product, quantity);
							break;
						}
						try {
							synchronized (products) {
								System.out.println("Chakam, ne moga da kupq produkta - neka zaredi");
								products.wait();
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
							return;
						}
					}
					int sum = product.getPrice() * quantity;
					this.money += sum;
					products.put(product, products.get(product) - quantity);
					LogShop logShop = LogShop.getInstance();
					if (logShop.listOfSales.containsKey(productName))
						logShop.listOfSales.put(productName, logShop.listOfSales.get(productName) + quantity);
					else
						logShop.listOfSales.put(productName, quantity);
					if (logShop.typeList.containsKey(typeName)) {
						logShop.typeList.put(typeName, logShop.typeList.get(typeName) + quantity);
						logShop.salesTypeSum.put(typeName, logShop.salesTypeSum.get(typeName) + sum);
					} else {
						logShop.typeList.put(typeName, quantity);
						logShop.salesTypeSum.put(typeName, sum);
					}
					LogShop.setSalesSum(LogShop.getSalesSum() + sum);
					return;
				}
			}
		} else {
			throw new ShopException("Vyveli ste greshni danni!!!");
		}
	}

	@Override
	public void addProduct(Product p, int quantity) throws ShopException {
		if (p != null && products.containsKey(p)) {
			int newQuantity = products.get(p);
			newQuantity += quantity;

			products.put(p, newQuantity);

			synchronized (products) {
				products.notify();
			}
		} else {
			throw new ShopException("Kakyv e tozi produkt???");
		}

	}

	@Override
	public void showProductByType() {
		SortedSet<Map.Entry<Product, Integer>> sorted = new TreeSet<Map.Entry<Product, Integer>>((s1, s2) -> {
			if (s1.getKey().getType().compareTo(s2.getKey().getType()) == 0) {
				return 1;
			}
			return s1.getKey().getType().compareTo(s2.getKey().getType());
		});
		sorted.addAll(products.entrySet());
		showSet(sorted);
	}

	@Override
	public void showByName() {
		SortedSet<Map.Entry<Product, Integer>> sorted = new TreeSet<Map.Entry<Product, Integer>>((s1, s2) -> {
			return s1.getKey().getName().compareTo(s2.getKey().getName());
		});
		sorted.addAll(products.entrySet());
		showSet(sorted);
	}

	@Override
	public void showByPriceASC(boolean howToSort) {
		SortedSet<Map.Entry<Product, Integer>> sorted = new TreeSet<Map.Entry<Product, Integer>>((s1, s2) -> {
			if (howToSort) {
				if (s1.getKey().getPrice() - s2.getKey().getPrice() == 0)
					return s1.getKey().getPrice();
				return s1.getKey().getPrice() - s2.getKey().getPrice();
			} else {
				if (s2.getKey().getPrice() - s1.getKey().getPrice() == 0)
					return s2.getKey().getPrice();
				return s2.getKey().getPrice() - s1.getKey().getPrice();
			}
		});
		sorted.addAll(products.entrySet());
		showSet(sorted);
	}

	@Override
	public void showByNalichnost() {
		for (Entry<Product, Integer> product : products.entrySet()) {
			if (product.getValue() != 0) {
				System.out.println(product);
			}
		}
	}

	@Override
	public void showProfit() {
		System.out.println("Profit: " + this.money);
	}

	@Override
	public ILogShop getLog() {
		return log;
	}

	@Override
	public List<Product> izcherpaniProduckti() {
		List<Product> pro = new ArrayList<Product>();
		for (Entry<Product, Integer> product : products.entrySet()) {
			if (product.getValue() == IZCHERPANA_NALICHNOST) {
				pro.add(product.getKey());
			}
		}
		return pro;
	}

	private void func(Product p, int quantity) throws ShopException {
		if (p != null) {
			int time = sup.getTimeOfProduct(p);
			try {
				System.out.println("Sega shte chakam ei tolkoz vreme: " + time);
				Thread.sleep(time * CONSTANT_FOR_TIME);
				this.addProduct(p, quantity);
				System.out.println("Dobavih produkta: " + p.getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void showSet(SortedSet<Map.Entry<Product, Integer>> sorted) {
		for (Entry<Product, Integer> product : sorted) {
			System.out.println(product);
		}
	}

}
