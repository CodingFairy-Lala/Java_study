package sh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExceptionStudy {

    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();

    public static void main(String[] args) {
        ExceptionStudy study = new ExceptionStudy();
        // study.test1();
        // study.test2();
        // study.test3();
        // study.test4();
        // study.test5();
        study.test6();

        System.out.println("정상 종료 ...");
    }

    /**
     * @실습문제 : 두 정수를 입력받고, 합/차/곱/몫/나머지 결과를 출력
     *       - 예외처리 필수
     *       - 결과 출력후 계속할지 여부(y/n)를 묻고, y를 입력한 경우 반복처리
     */

    private void test6() {
        while (true) {
            try {
                System.out.print("정수 1 입력하세요 : ");
                int n = sc.nextInt();
                System.out.print("정수 2 입력하세요 : ");
                int m = sc.nextInt();
                int big = Math.max(n, m);
                int small = Math.min(n, m);
                System.out.println("합 : " + (big + small)
                        + "\n차 : " + (big - small)
                        + "\n곱 : " + (big * small)
                        + "\n몫 : " + (big / small)
                        + "\n나머지 : " + (big % small));
                // 계속 진행할지 확인
                System.out.print("계속 하시겠습니까? (y/n) : ");
                String answer = sc.next();
                if (answer.equals("n")) {
                    System.out.println("종료합니다..");
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("산술 예외가 발생했습니다!");
            } catch (InputMismatchException e) {
                System.out.println("유효한 정수를 입력해주세요.");
                sc.nextInt(); // 입력 버퍼 비우기
            } catch (Exception e) {
                System.out.println("예외가 발생했습니다." + e);
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
    }

    /**
     * Exception catch절
     * - 발생한 예외별로 처리가 다르지 않다면, 최상위 예외 catch절을 사용한다.
     */

    private void test5() {
        try {
            if (rnd.nextBoolean()) {
                int[] arr = new int[3];
                System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
            }
            if (rnd.nextBoolean()) {
                System.out.println(100 / 0);
            }
            if (rnd.nextBoolean()) {
                String str = null;
                System.out.println(str.length());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 발생한 예외 : 예외 메세지 ~ 예외 발생시 callstack로그 (링크)
        }

    }

    /**
     * catch절의 다형성
     * 
     * - 상속구조가 아닌 예외클래스에 대한 catch절의 순서는 상관 없다.
     * - 상속구조인 경우, 자식/부모 순으로 작성해야 한다.
     * -> 위에서부터 발생한 예외객체를 처리 할 수 있는지 검사
     */

    private void test4() {
        try {
            if (rnd.nextBoolean()) {
                int[] arr = new int[3];
                System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
            }
            if (rnd.nextBoolean()) {
                System.out.println(100 / 0);
            }
            if (rnd.nextBoolean()) {
                String str = null;
                System.out.println(str.length());
            }
        } catch (ArithmeticException e) {
            System.out.println("산술연산 예외가 발생했습니다.");
        } catch (NullPointerException e) {
            System.out.println("NPE가 발생했습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 유효하지 않습니다.");
        } catch (RuntimeException e) {
            System.out.println("런타임 예외가 발생했습니다." + e);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다." + e);
        }

    }

    /**
     * try~catch~finally 실행순서
     * 
     * finally
     * - try에서 예외가 발생하건 안하건 무조건 실행되는 구문.
     * - try에서 조기 리턴을 해도 finally는 실행된다.
     */

    private void test3() {
        System.out.println(1);
        try {
            System.out.println(2);
            // 예외발생
            System.out.println(100 / 0);

            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);
        } finally {
            System.out.println(100);
        }
        System.out.println(5);

    }

    /**
     * 사용자 입력값 반복 처리
     */
    private void test2() {
        while (true) {
            try {
                System.out.println("정수 1 : ");
                int num1 = sc.nextInt();
                System.out.println("정수 2 : ");
                int num2 = sc.nextInt();
                System.out.printf("%d와 %d의 합은 %d입니다.\n", num1, num2, num1 + num2);
                break;
            } catch (InputMismatchException e) {
                System.out.println("유효한 정수를 입력해주세요.");
                sc.nextInt(); // 입력 버퍼 비우기
            }
        }
    }

    /**
     * ArithmeticException
     * InputMismatchException
     */

    private void test1() {

        try {
            // 예외가 발생할 수 있는 코드
            System.out.println("정수 1 입력하세요 : ");
            int n = sc.nextInt();
            System.out.println("정수 2 입력하세요 : ");
            int m = sc.nextInt();
            System.out.printf("%d / %d => %d\n", n, m, n / m);

            // checked exception 예외처리 강제화
            // FileReader fr = new FileReader("abc.txt");

        } catch (ArithmeticException e) {
            // 예외가 발생했을때 처리 할 코드
            System.out.println("산술 예외가 발생했습니다!");
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력하실 수 있습니다!");
        }
        // catch (FileNotFoundException e) {
        // System.out.println("파일을 찾을 수 없습니다.");
        // }
    }
}
