package com.sh.test.condition;

import java.util.Scanner;

public class Test2Review {

	public static void main(String[] args) {
		Test2Review rv = new Test2Review();
		rv.test();
	}
	
	/**
	 * [문제 2]
- 클래스 : com.sh.test.condition.Test2.java
- 메소드명 : public void test()

    국어(int), 영어(int), 수학(int) 점수를 정수형으로 입력 받아 
    총점(int)과 평균(double)을 계산하고 
    세 과목의 점수와 평균을 가지고 합격여부 처리, 
    세 과목 점수가 각각 40점 이상이면서, 평균이 60점 이상이면 합격,
    아니면 불합격을 출력하는 프로그램을 작성하세요. 
	 * 
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avr = total / 3;
		
		boolean boo1 = kor >= 40 && eng >= 40 && math >=40;
		boolean boo2 = avr >= 60;
				
		
		if (boo1 && boo2) {
			System.out.println("평균점수 : "+avr);
			System.out.println("합격입니다.");
		} else {
			System.out.println("평균점수 : "+avr);
			System.out.println("불합격입니다.");
		}
	}
}
