package sh.java.polymorphism.product;

public class Product {

	private String productCode;
	private String productName;
	private String brand;
	private int price;

	public Product() {
		super();
	}

	public Product(String productCode, String productName, String brand, int price) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String productInfo() {
		return "productCode = " + productCode + ", productName = " + productName + ", brand = " + brand + ", price = "
				+ price;
	}

}
