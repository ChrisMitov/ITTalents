package music.shop;

public class Product {
	private String name;
	private final int price = 500;
	private ProductType type;

	public Product(String name, ProductType type) {
		this.name = name;
		this.type = type;
	}

//	public Product(String name, int price, ProductType type) {
//		this(name, type);
//		this.price = price;
//	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	ProductType getType() {
		return type;
	}
}
