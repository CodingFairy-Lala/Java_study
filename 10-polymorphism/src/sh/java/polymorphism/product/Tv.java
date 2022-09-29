package sh.java.polymorphism.product;

public class Tv extends Product {

    private String resolution; // 해상도
    private int size; // 인치

    public Tv() {
        super();
    }

    public Tv(String productCode, String productName, String brand, int price, String resolution, int size) {
        super(productCode, productName, brand, price);
        this.resolution = resolution;
        this.size = size;
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

    @Override
    public String productInfo() {
        return tvInfo();
    }

    public String tvInfo() {
        return super.productInfo() + ", resolution = " + getResolution() + ", size = " + getSize();
    }

}
