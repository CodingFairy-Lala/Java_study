package sh.java.inheritance.product.before;

import java.util.Arrays;

public class Desktop {
    private String productCode;
    private String productName;
    private String brand;
    private int price;

    private String os;

    private String[] hardwares;

    public Desktop() {
        super();
    }

    public Desktop(String productCode, String productName, String brand, int price, String os, String[] hardwares) {
        this.productCode = productCode;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.os = os;
        this.hardwares = hardwares;
    }

    // getter / setter
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

    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String[] getHardwares() {
        return this.hardwares;
    }

    public void setHardwares(String[] hardwares) {
        this.hardwares = hardwares;
    }

    public String desktopInfo() {
        return "productCode = " + productCode + ", productName = " + productName + ", brand = " + brand + ", price = "
                + price + ", os = " + os + ", hardwares = " + Arrays.toString(hardwares);
    }

}
