package sh.java.polymorphism.basic;

/**
 * 오직 상수와 추상메소드만 가질 수 있다.
 * - 오직 상수와 추상메소드만 가질 수 있다.
 * - 다중구현이 가능하다.
 */

public interface Runnable {

    // public static final int NUM_OF_LEGS = 4;
    int NUM_OF_LEGS = 4;

    // public abstract void run();
    void run();

}
