package sh.java.polymorphism.basic;

public class Eagle extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("독수리가 " + NUM_OF_WINGS + "개의 날개로 납니다.");
    }

    @Override
    public void say() {
        System.out.println("저는 독수리 입니다.");
    }

    @Override
    public void attack() {
        peck();
    }

    public void peck() {
        System.out.println("독수리 쪼기!");
    }

}
