package sh.java.inheritance.product.after;

import java.util.Arrays;

/**
 * 상속
 * - 부모클래스가 가진 멤버(필드/메소드)를 자식 클래스에 선언 없이 사용할 수 있도록 한다.
 * - 자식클래스의 공통된 코드(중복된 코드)를 부모 클래스에서 효율적으로 관리할 수 있다.
 * 
 * 특징
 * - 부모의 필드/메소드를 자식클래스에서 선언 없이 접근
 * 
 * - 부모의 private 멤버는 상속을 받았으나, 직접 접근이 안됨.
 * -> public 메소드를 통해 제어
 * -> super 부모생성자를 호출해서 부모클래스 안에서 값 설정함.
 * 
 * - 모든 클래스는 Object클래스의 후손
 * -> Object의 메소드를 모든 클래스에서 사용 가능.
 * -> toString(), hashCode(), equals()
 * -> extends 부모클래스 선언이 없다면, extends Object가 생략된 형태
 * 
 * - 부모클래스의 생성자/초기화 블럭은 상속이 안된다.
 * -> 자식클래스에서 별도로 작성 해야함.
 * 
 * - 부모에게 물려받은 메소드를 자식클래스에 따라 Override 할 수 있다.
 * -> 단, 메소드 시그니처가 동일해야 한다.
 * 
 * - 모든 생성자는 첫줄에 this() 또는 super()를 호출한다.
 * -> 아무것도 적혀있지 않다면, super()가 생략된 것이다.
 * 
 * 
 */

public class Desktop extends Product {

    private String os;
    private String[] hardwares;

    public Desktop() {
        super();
    }

    public Desktop(String productCode, String productName, String brand, int price, String os, String[] hardwares) {
        // 물려받은 private 필드에 직접접근 할 수 없다.
        // this.productCode = productCode;
        // this.productName = productName;
        // this.brand = barnd;
        // this.price = price;

        // this.setProductCode(productCode);
        // this.setProductName(productName);
        // this.setBrand(barnd);
        // this.setPrice(price);

        // 부모 생성자 호출을 통해 private 필드값 설정
        // super() 호출도 생성자 맨 첫출에 단 한번 사용가능
        super(productCode, productName, brand, price);

        this.os = os;
        this.hardwares = hardwares;

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
        return "productCode = " + getProductCode() + ", productName = " + getProductName() + ", brand = " + getBrand()
                + ", price = " + getPrice() + ", os = " + getOs() + ", hardwares = " + Arrays.toString(hardwares);
    }

}
