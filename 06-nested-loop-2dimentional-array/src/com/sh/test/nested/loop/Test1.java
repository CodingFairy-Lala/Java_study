package com.sh.test.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 study = new Test1();
		study.test();
	}
	/**
	 * [문제1]
클래스명: com.sh.test.nested.loop.Test1.java
메소드명: public void test()

    정수하나 입력받아, 그 수가 양수일때만 입력된 
    수를 행 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
    출력예)
    정수 하나 입력 : 5
    1
    12
    123
    1234
    12345


    출력예)
    정수 하나 입력 : -5
    양수가 아닙니다.
	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요. : ");
		int size = sc.nextInt();
		if (size >= 1) {
			for(int i = 0; i < size; i++) {
				int data = 0;
				for(int j = 0; j <= i ; j++) {
					data += 1;
					System.out.print(data);			
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
}
