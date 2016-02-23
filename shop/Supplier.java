package music.shop;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Supplier implements Runnable {
	private static final int MONTH_TIME = 3000;
	private static final int MIN_DAYS_TO_WAIT = 1;
	private static final int MAX_DAYS_TO_WAIT = 30;
	private static final int HOW_MUCH_TO_SELL = 10;
	private Map<Product, Integer> gama;
	private IShop shop;

	public Supplier(IShop shop) {
		this.gama = new ConcurrentHashMap<Product, Integer>();
		for (String productName : new String[] { "Cigulka", "Viola", "Kontrabas" })
			gama.put(new Product(productName, ProductType.STRUNNI),
					(int) (Math.random() * (MAX_DAYS_TO_WAIT - MIN_DAYS_TO_WAIT) + MIN_DAYS_TO_WAIT));
		for (String productName : new String[] { "Trompet", "Tuba", "Klarinet" })
			gama.put(new Product(productName, ProductType.DUHOVI),
					(int) (Math.random() * (MAX_DAYS_TO_WAIT - MIN_DAYS_TO_WAIT) + MIN_DAYS_TO_WAIT));
		for (String productName : new String[] { "Baraban", "Typan", "Daire" })
			gama.put(new Product(productName, ProductType.UDARNI),
					(int) (Math.random() * (MAX_DAYS_TO_WAIT - MIN_DAYS_TO_WAIT) + MIN_DAYS_TO_WAIT));
		for (String productName : new String[] { "Piano", "Organ", "Akordeon" })
			gama.put(new Product(productName, ProductType.KLAVISHNI),
					(int) (Math.random() * (MAX_DAYS_TO_WAIT - MIN_DAYS_TO_WAIT) + MIN_DAYS_TO_WAIT));
		for (String productName : new String[] { "Sintezator", "Bas-kitara", "Elektricheska cigulka" })
			gama.put(new Product(productName, ProductType.ELEKTRONNI),
					(int) (Math.random() * (MAX_DAYS_TO_WAIT - MIN_DAYS_TO_WAIT) + MIN_DAYS_TO_WAIT));
		this.shop = shop;
	}

	public void addProductInShop(Product p, int quantity) throws ShopException {
		if (p != null) {
			System.out.println("Zaredih s produkta " + p.getName());
			shop.addProduct(p, quantity);
		}
	}

	public int getTimeOfProduct(Product p) throws ShopException {
		if (gama.containsKey(p))
			return gama.get(p);
		else
			throw new ShopException("Kakyv e tozi produkt?!?!");
	}

	@Override
	public void run() {
		while (true) {
			List<Product> products = shop.izcherpaniProduckti();
			try {
				Thread.sleep(MONTH_TIME);
				System.out.println("Mina edin mesec");
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			System.out.println("Sega zarejdam magazina...");
			for (Product p : products) {
				try {
					shop.addProduct(p, HOW_MUCH_TO_SELL);
					System.out.println("Sega zaredih " + p.getName());
				} catch (ShopException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
