package com.sh.cast.practice;

import java.util.Scanner;

public class TestCasting {
	
	public static void main(String[] args) {
		TestCasting CastingSample = new TestCasting();
//		CastingSample.printUniCode();
		CastingSample.calculatorScore();
	}

	/**
	 * [실습2]
public void calculatorScore(){}
 - 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 계산해서 출력함
 - 총점과 평균은 정수형으로 처리함
 - 입력예 : 
    국어 : 90.0
    영어 : 90.0
    수학 : 90.0
 - 출력예 : 
    총점 : 270
    평균 : 90
	 */
	
	public void calculatorScore(){
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		double kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		double eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		double math = sc.nextInt();
		
		int total = (int) (kor + eng + math);
		int avr = total / 3;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avr);
		
	}
	
	/**
	 * [형변환 실습]
 - 새 패키지 추가 : com.sh.cast.practice
 - 실행 테스트용 클래스 : TestCasting (main() 포함 : 아래의 메소드 실행 테스트)
 - 기능 제공용 클래스 : CastingSample (각 문제별 메소드 추가함)

[실습 1]
public void printUniCode(){}
 - 키보드로 문자하나를 입력받아, 그 문자의 유니코드(아스키코드)를 출력되게 함
 - 입력예 : 
    문자 입력 : A
 - 출력예 : 
    A is unicode : 65
	 */
	
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		int uni = ch;
		System.out.printf("%c is unicode : %d", ch, uni);
	}
}
