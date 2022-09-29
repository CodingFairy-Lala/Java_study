package com.sh.test.break_continue;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 study = new Test1();
		study.test1();
		study.test2();
	}
	
	/**
	 * [문제 1]
- 클래스 : com.sh.test.break_continue.Test1.java
- 메소드명 : public void test1()
    1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.

- 메소드명 : public void test2()
    2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
         Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
     
         결과:
         정수를 하나 입력하세요. => 100
         다른 정수를 하나 입력하세요. => 1
         ====================
         1부터 100까지의 홀수의 합은 2500입니다.
	 */
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.print("다른 정수를 하나 입력하세요. : ");
		int num2 = sc.nextInt();
		
		int start = num1 < num2 ? num1 : num2;
		int end = num1 > num2 ? num1 : num2;
		int result = 0;

		int i = 0;
		while (i++ < end) {
			if (i < start)
				continue;
			if (i % 2 == 0) 
				continue;
			result = result + i;
		}
		System.out.println("===========================");
		System.out.printf("%d부터 %d까지의 홀수의 합은 %d입니다.\n", start, end, result);
		
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		int result = 1;
		for(int i = 1; i <= num; i ++) {
			if(i % 2 == 0) 
				continue;
			result = result * i;
		}
		System.out.printf("1 부터 [%d] 까지 홀수의 곱은 [%d] 입니다.\n", num, result);
	}
}
