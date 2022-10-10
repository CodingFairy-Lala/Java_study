package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        try {
            System.out.print("정수를 입력하세요 : ");
            int a = sc.nextInt();
            System.out.print("결과 값 : " + cal.getSum(a));
        } catch (Exception e) {
            System.out.println("입력 값에 오류가 있습니다.");
        }

    }

}
