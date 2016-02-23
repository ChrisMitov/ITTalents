package music.shop;

public class Demo {
	public static void main(String[] args) {
		try {
			IShop s = new Shop(1000);
			s.showProductByType();
			System.out.println("------------------");
			s.showByName();
			System.out.println("------------------");
			s.showByPriceASC(false);
			System.out.println("------------------");
			s.showByNalichnost();
			s.addProduct(new Product("Cigulka", ProductType.STRUNNI), 5);
			s.sellProduct("Baraban", 10);
			s.sellProduct("Piano", 3);
			System.out.println("------------------");
			s.showByName();
			System.out.println("------------------");
			System.out.println("Sum of all sales: " + LogShop.getSalesSum());
			System.out.println("Most sold product is: " + s.getLog().getMostSoldProduct());
			System.out.println("Least sold product is: " + s.getLog().getLeastSoldProduct());
			System.out.println("Most sold type of product is: " + s.getLog().getMostSoldTypeOfProduct());
			System.out.println("Most sold type of product is by sum : " + s.getLog().getMostSoldTypeOfProductBySum());
			Client cl = new Client(s);
			Supplier su = new Supplier(s);
			Thread t1 = new Thread(cl);
			Thread t2 = new Thread(su);
			t1.start();
			t2.start();
		} catch (ShopException e) {
			e.printStackTrace();
		}
	}
}
