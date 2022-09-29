package com.sh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Test3 study = new Test3();
		study.test();
	}

	/**
	 * [문제 3]
- 클래스 : com.sh.test.loop.Test3.java
- 메소드명 : public void test()

    정수를 입력 받아 입력된 값의 구구단 프로그램을 만들어보세요.  
 
     예) 5입력 
          5X1=5
          5X2=10
          5X3=15
         .
         .
          5X9=45

       단, 1~9까지만 가능하고 이외에 값을 넣으면 “잘못입력하셨습니다. 프로그램종료합니다”출력

	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력(1 ~ 9) : ");
		int n = sc.nextInt();
		if (n <= 0)
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		else if (n <=9)
			for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, (n * i));
			}
		else
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
		
	}
}
