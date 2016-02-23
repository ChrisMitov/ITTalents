package music.shop;

import java.util.List;

public interface IShop {

	void sellProduct(String name, int quantity) throws ShopException;

	void addProduct(Product p, int quantity) throws ShopException;

	void showProductByType();

	void showByName();

	void showByPriceASC(boolean howToSort);

	void showByNalichnost();
	
	void showProfit();

	ILogShop getLog();

	List<Product> izcherpaniProduckti();
}