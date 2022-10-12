package sh.java.thread.control;

import java.util.Scanner;

/**
 * 쓰레드 생명주기
 * - new 생성
 * - runnable 실행 / 실행 대기
 * - waiting / timed_waiting / blocked 일시 정지
 * - terminated 소멸
 */

public class ThreadControlStudy {

    public static void main(String[] args) {
        ThreadControlStudy study = new ThreadControlStudy();
        // study.test1();
        // study.test2();
        // study.test3();
        study.test4();

        System.out.println(Thread.currentThread().getName() + "End!");
    }

    /**
     * @실습문제 :
     *       - 2의 배수를 출력하는 쓰레드 (1초 간격 출력)
     *       - 3의 배수를 출력하는 쓰레드 (2초 간격 출력)
     */

    private void test4() {
        Thread th2 = new Thread(new MultiplyThread(2, 1000), "2의 배수 쓰레드");
        Thread th3 = new Thread(new MultiplyThread(3, 2000), "3의 배수 쓰레드");
        th2.start();
        th3.start();

        System.out.println("엔터를 누르면 멈춥니다...");
        new Scanner(System.in).nextLine();
        th2.interrupt();
        th3.interrupt();
    }

    class MultiplyThread implements Runnable {

        private int num;
        private long millis;

        public MultiplyThread(int num, long millis) {
            this.millis = millis;
            this.num = num;
        }

        @Override
        public void run() {
            for (int i = 1;; i++) {
                try {
                    Thread.sleep(millis); // 밀리 초 지연
                } catch (InterruptedException e) {
                    break;
                }
                System.out.println("[" + Thread.currentThread().getName() + "] " + num * i);
            }
            System.out.println(Thread.currentThread().getName() + " end!");
        }

    }

    /**
     * interrupt
     * - 다른 쓰레드에 InterruptedException을 유발해 종료/분기 처리가 가능하다.
     */

    private void test3() {
        Thread th = new Thread(new SleepThread(), "초시계 쓰레드");
        th.start();

        System.out.println("엔터를 누르면, 초시계가 멈춥니다...");
        new Scanner(System.in).nextLine();
        th.interrupt();
    }

    /**
     * Daemon Thread
     * - 백그라운드 작동하는 쓰레드
     * - 일반 쓰레드가 모두 종료하면 데먼 쓰레드는 자동 종료
     */
    private void test2() {
        Thread th = new Thread(new SleepThread(), "초시계 쓰레드d");
        th.setDaemon(true); // 일반쓰레드를 데먼쓰레드로 변경
        th.start();

        System.out.println("아무 글자나 입력하세요...");
        String str = new Scanner(System.in).nextLine();
    }

    /**
     * sleep
     * - 특정 쓰레드를 지정한 milli 초만큼 일시 정지 시킨다.
     */
    private void test1() {
        new Thread(new SleepThread(), "초시계 쓰레드").start();

    }

    class SleepThread implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(1000); // 1초 지연
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
                System.out.println("[" + Thread.currentThread().getName() + "] " + i);

            }
            System.out.println(Thread.currentThread().getName() + " end!");
        }

    }

}
