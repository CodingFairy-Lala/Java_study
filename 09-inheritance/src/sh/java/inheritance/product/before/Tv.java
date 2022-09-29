package sh.java.inheritance.product.before;

public class Tv {

    private String productCode;
    private String productName;
    private String brand;
    private int price;

    private String resolution; // 해상도

    private int size; // 인치

    public Tv() {
        super();
    }

    public Tv(String productCode, String productName, String brand, int price, String resolution, int size) {
        this.productCode = productCode;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.resolution = resolution;
        this.size = size;
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

    public String getResolution() {
        return this.resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String tvInfo() {
        return "productCode = " + productCode + ", productName = " + productName + ", brand = " + brand + ", price = "
                + price + ", resolution = " + resolution + ", size = " + size;
    }

}
