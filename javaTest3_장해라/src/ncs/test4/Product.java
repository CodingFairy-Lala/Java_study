package ncs.test4;

public class Product {

    private String name;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String information() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "상품명 : " + getName() +
                "\n가격 : " + getPrice() + " 원" +
                "\n수량 : " + getQuantity() + " 개";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
