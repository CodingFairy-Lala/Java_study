package com.sh.test.condition;

import java.util.Scanner;

public class Test3Review {
	
	public static void main(String[] args) {
		Test3Review rv = new Test3Review();
		rv.test();
	}

	
	/**
	 * [문제 3]
- 클래스 : com.sh.test.condition.Test3.java
- 메소드명 : public void test()

    정수 두개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 계산한 뒤
    결과를 출력하는 계산기 프로그램을 만들어보세요.      

    출력 예) 입력 5, 6, +
           5+6=11

    음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면
    “잘못 입력 하셨습니다.프로그램을 종료합니다.” 라는 문구가 출력되게 하세요.
	 * 
	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		int i1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int i2 = sc.nextInt();
		if (i1 < 0 || i2 <0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}

		System.out.print("연산자 입력 : ");
		char cal = sc.next().charAt(0);
		int result = 0;	
		
		
		if (cal == '+') {
			System.out.printf("%d + %d = %d", i1, i2, (i1+i2));
		} 
		else if (cal == '-') {
			System.out.printf("%d - %d = %d", i1, i2, (i1-i2));
		}
		else if (cal == '*') {
			System.out.printf("%d * %d = %d", i1, i2, (i1*i2));
		}
		else if (cal == '/') {
			System.out.printf("%d / %d = %d", i1, i2, (i1/i2));
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		
		
	}
}
