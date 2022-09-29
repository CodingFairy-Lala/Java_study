package com.sh.test.nested.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 study = new Test2();
		study.test();
	}

	/**
	 * [문제2]
클래스명: com.sh.test.nested.loop.Test2.java
메소드명: public void test()

    정수하나 입력받아, 그 수가 양수일때만 입력된 수를 
     행수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
    
    출력예)
    정수 입력 : 5
    *****
    ****
    ***
    **
    *

    출력예)
    정수 입력 : 0
    양수가 아닙니다.
	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요. : ");
		int size = sc.nextInt();
		int sub = size;
		if (size >= 1) {
			for(int i = 0; i <= size; i++) {
				for(int j = sub; j > 0 ; j--) {
					char print = '*';
					System.out.print(print);	
				}
				sub -= 1;
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	
	}
}
