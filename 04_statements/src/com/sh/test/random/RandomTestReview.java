package com.sh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTestReview {

	public static void main(String[] args) {
		RandomTestReview r = new RandomTestReview();
//		r.test1();
		r.test2();
	}
	
	/**
	 * 랜덤범위의 값 추
	 */
	
	public void test2() {
		Random rnd = new Random();
		// 0~9까지
		System.out.println(rnd.nextInt(10));
		// 1~10
		System.out.println(rnd.nextInt(10)+1);
		// 20~35
		System.out.println(rnd.nextInt(16)+20);
		// 0 또는 1
		System.out.println(rnd.nextInt(2));
		
	}
	
	/**
	 * 가위 바위 보 게임
	 */
	
	public void test1() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		String menu = "=========가위 바위 보 게임=========\n"
					+ "숫자를 선택하세요. (1. 가위 / 2. 바위 / 3. 보) : ";
		System.out.println(menu);
		int userNo = sc.nextInt();
		int comNo = rnd.nextInt(3)+1;
		
		String user = userNo == 1 ? "가위" : (userNo == 2 ? "바위" : "보");
		String com = comNo == 1 ? "가위" : (userNo == 2 ? "바위" : "보");
				
		
		System.out.println("==============결과==============");
		System.out.println("당신은" +user+ "를 냈습니다.");
		System.out.println("컴퓨터는" +com+ "를 냈습니다.");
		System.out.println("===============================");
		
		if (userNo == comNo) {
			System.out.println("비겼습니다.");
		} 
		else if ((userNo == 1 && comNo == 2) || (userNo == 2 && comNo == 3) || (userNo == 3 && comNo == 1)) {
			System.out.println("당신이 졌습니다.");
		}
		else if ((userNo == 2 && comNo == 1) || (userNo == 3 && comNo == 2) || (userNo == 1 && comNo == 3)) {
			System.out.println("당신이 이습니다.");
		}
			
			
			
	}
}
