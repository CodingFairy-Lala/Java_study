package sh.java.thread.basic;

public class ThreadStudy {

    public static void main(String[] args) {
        ThreadStudy study = new ThreadStudy();
        // study.test1();
        // study.test2();
        // study.test3();
        study.test4();
        System.out.println(Thread.currentThread().getName() + "End!");

    }

    /**
     * 쓰레드 스케쥴링
     * - OS 스케쥴링을 따라 임의의 순서가 부여된다.
     * - 우선순위 부여가능 (1 ~ 10)
     * -> 10 Thread.MAX_PRIORITY
     * -> 5 Thread.NORM_PRIORITY
     * -> 1 Thread.MIN_PRIORITY
     */
    private void test4() {
        Thread th1 = new Thread(new Foo("O"));
        Thread th2 = new Thread(new Foo("X"));
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);

        th1.start(); // 쓰레드별 새 callstack을 만들고 run 호출
        th2.start();

    }

    /**
     * 하나의 쓰레드 클래스로 여러 쓰레드 만들기
     */
    private void test3() {
        // Thread th1 = new Thread(new Foo("|"));
        // Thread th2 = new Thread(new Foo("-"));
        // th1.start();
        // th2.start();

        String[] arr = { "|", "-", "+", "*", "@", "!", "?", "^", "&", "$" };
        for (int i = 0; i < arr.length; i++) {
            Thread th = new Thread(new Foo(arr[i]));
            th.start();
        }

    }

    class Foo implements Runnable {
        private String str;

        public Foo(String str) {
            this.str = str;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++)
                System.out.println(str);
        }
    }

    /**
     * 쓰레드클래스 만들기 2
     * - Runnable 구현 - run 오버라이드
     */
    private void test2() {
        Thread th3 = new Thread(new MyThread3());
        Thread th4 = new Thread(new MyThread4());
        th3.start();
        th4.start();
    }

    class MyThread3 implements Runnable {

        @Override
        public void run() {
            a("|");
        }
    }

    class MyThread4 implements Runnable {

        @Override
        public void run() {
            b("-");
        }
    }

    /**
     * 쓰레드 클래스 만들기 1
     * - Thread 상속 - run 오버라이드
     */
    private void test1() {
        Thread th1 = new MyThread1();
        Thread th2 = new MyThread2();
        th1.start();
        th2.start();
    }

    class MyThread1 extends Thread {

        @Override
        public void run() {
            a("|");
        }
    }

    class MyThread2 extends Thread {

        @Override
        public void run() {
            b("-");
        }
    }

    public void a(String str) {
        for (int i = 0; i < 100; i++) {
            System.out.println(str);
        }
    }

    public void b(String str) {
        for (int i = 0; i < 100; i++) {
            System.out.println(str);
        }
    }

}
