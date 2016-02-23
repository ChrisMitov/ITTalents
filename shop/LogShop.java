package music.shop;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class LogShop implements ILogShop {
	private static LogShop instance = null;
	private static int salesSum;
	Map<String, Integer> listOfSales;
	Map<String, Integer> typeList;
	Map<String, Integer> salesTypeSum;

	private LogShop() {
		this.listOfSales = new HashMap<String, Integer>();
		this.typeList = new HashMap<String, Integer>();
		this.salesTypeSum = new HashMap<String, Integer>();
	}

	public static LogShop getInstance() {
		if (instance == null) {
			instance = new LogShop();
		}
		return instance;
	}

	@Override
	public String getMostSoldProduct() {
		return sortSoldProduct(listOfSales).first().getKey();
	}

	@Override
	public String getLeastSoldProduct() {
		return sortSoldProduct(listOfSales).last().getKey();
	}

	@Override
	public String getMostSoldTypeOfProduct() {
		return sortSoldProduct(typeList).first().getKey();
	}

	@Override
	public String getMostSoldTypeOfProductBySum() {
		return sortSoldProduct(salesTypeSum).first().getKey();
	}

	private SortedSet<Map.Entry<String, Integer>> sortSoldProduct(Map<String, Integer> who) {
		SortedSet<Map.Entry<String, Integer>> sorted = new TreeSet<Map.Entry<String, Integer>>((s1, s2) -> {
			if (s1.getValue() - s2.getValue() == 0) {
				return s1.getValue();
			} else {
				return s2.getValue() - s1.getValue();
			}
		});
		sorted.addAll(who.entrySet());
		return sorted;
	}

	static int getSalesSum() {
		return salesSum;
	}

	static void setSalesSum(int salesSum) throws ShopException {
		if (salesSum > LogShop.salesSum)
			LogShop.salesSum = salesSum;
		else
			throw new ShopException("Incorrect salesSum");
	}
}
