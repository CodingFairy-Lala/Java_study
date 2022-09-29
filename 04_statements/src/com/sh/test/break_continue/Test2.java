package com.sh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 study = new Test2();
		study.test();
	}
	
	/**
	 * [문제 2]
- 클래스 : com.sh.test.break_continue.Test2.java
- 메소드명 : public void test()

       1~100 사이의 임의의 난수를 발생시키고, 
       정수 한 개를 입력 받아, 
       난수가 입력 받은 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력, 
       난수가 입력 받은 정수보다 크면 “입력하신 정수보다 큽니다.” 출력하세요.
       단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복되도록 하고, 
       정답인 경우 “정답입니다. 5회 만에 정답을 맞추셨습니다.”와 같이 
       몇 회 만에 정답을 맞추었는지 출력하도록 작성하세요.
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int comNo = rnd.nextInt(100) + 1;
		String choose = "1~100 사이의 숫자를 선택하세요 : ";
		int i = 1;
		do {
			System.out.print(choose);
			int userNo = sc.nextInt();
			System.out.println(comNo);
			if (userNo != comNo) {
				if (userNo > comNo)
					System.out.println("입력하신 정수보다 작습니다.");
				else if (userNo < comNo)
					System.out.println("입력하신 정수보다 큽니다.");
				continue;
			}
			if (userNo == comNo)
				System.out.printf("정답입니다! %d회 만에 정답을 맞추셨습니다.\n", i);
				break;
			}while(i++ >= 0);
	}
}
