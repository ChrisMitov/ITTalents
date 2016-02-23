package music.shop;

public class Client implements Runnable {

	private static final int MIN_PRODUCTS_TO_BUY = 1;
	private static final int MAX_PRODUCTS_TO_BUY = 3;
	private IShop shop;

	public Client(IShop shop) {
		this.shop = shop;
	}

	@Override
	public void run() {
		String[] products = { "Cigulka", "Viola", "Kontrabas", "Trompet", "Tuba", "Klarinet", "Baraban", "Typan",
				"Daire", "Piano", "Organ", "Akordeon", "Sintezator", "Bas-kitara", "Elektricheska cigulka" };
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			System.out.println("Pazaruvam...");
			try {
				String productForBuying = products[(int) (Math.random() * products.length)];
				shop.sellProduct(productForBuying, (int) Math.random() * MAX_PRODUCTS_TO_BUY + MIN_PRODUCTS_TO_BUY);
				System.out.println("Kupih si " + productForBuying);
			} catch (ShopException e) {
				e.printStackTrace();
			}
		}

	}

}
