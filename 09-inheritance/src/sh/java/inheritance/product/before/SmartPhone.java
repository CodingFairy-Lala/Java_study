package sh.java.inheritance.product.before;

public class SmartPhone {

    private String productCode;
    private String productName;
    private String brand;
    private int price;

    private String os;

    private String carrier; // 통신사

    public SmartPhone() {
        super();
    }

    public SmartPhone(String productCode, String productName, String brand, int price, String os, String carrier) {
        this.productCode = productCode;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.os = os;
        this.carrier = carrier;
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

    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String smartPhoneInfo() {
        return "productCode = " + productCode + ", productName = " + productName + ", brand = " + brand + ", price = "
                + price + ", os = " + os + ", carrier = " + carrier;
    }

}
