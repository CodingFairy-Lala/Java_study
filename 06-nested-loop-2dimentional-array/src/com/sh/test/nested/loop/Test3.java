package com.sh.test.nested.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 st = new Test3();
		st.test();
	}
	
	/**
	 * [문제3]
클래스명: com.sh.test.nested.loop.Test3.java
메소드명: public void test()

    정수하나 입력받아, 그 수가 양수일때만 입력된 
    수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
    프로그램을 만들어보자.
        출력예)
      정수 입력 : 5
    
         *
         **
         ***
         ****
         *****
          ****
           ***
            **
             *
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("양수를 입력하세요.");
			return;
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		String a = " ";
		String s = "*";
		
		for(int i = 0; i < num-1; i++) {
			int k = 0;
			System.out.print(a);
			for(int j = num-1; j > 0; j--) {
				System.out.print(s);
			}
			System.out.println();
		}
		
		
//		cba:
//			for(int i = num-1; i > 0; i--) {
//				for(int j = 0; j <= i-1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		
//		for(int k = num-1; k > 0; k--) {
//			for(int l = 0; l <= k-1; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}
}
