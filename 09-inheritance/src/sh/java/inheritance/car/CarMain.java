package sh.java.inheritance.car;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("소나타", "블랙", 4);
        System.out.println(car.toString());
        System.out.println(car.hashCode());

        Car car2 = new Car("소나타", "블랙", 4);
        System.out.println(car2);
        System.out.println(car2.hashCode());

        // 동일성 identity - 두 객체가 동일한가(주소값이 같은가) ==
        // 동등성 equality - 두 객체의 정보가 동일한가 equals메소드 오버라이드
        System.out.println(car == car2); // false
        System.out.println(car.equals(car2)); // true
        System.out.println(car.hashCode() == car2.hashCode()); // true

        // clone
        Car car3 = car.clone();
        System.out.println(car == car3); // false
        System.out.println(car.equals(car3)); // true
        System.out.println(car.hashCode() == car3.hashCode()); // true
    }

}
