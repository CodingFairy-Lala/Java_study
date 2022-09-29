package com.sh.test.loop;

import java.util.Scanner;

public class charTest {

	public static void main(String[] args) {

		charTest study = new charTest();
		study.test();
	}
	
/**
 * 패키지 com.sh.test.condition.CharTest

사용자에게 입력받은 문자하나를 문자타입에 따라 구분해 출력하세요.
* 입력하신 문자 1 은/는  숫자입니다.
* 입력하신 문자 c 은/는  알파벳입니다.
* 입력하신 문자 z 은/는  알파벳입니다.
* 입력하신 문자 * 은/는  특수문자입니다.
 */

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~9, 알파벳, 기타 특수문자를 입력하세요. >");
		char ch = sc.next().charAt(0);
		if (ch >= '0' && ch <= '9') {
			System.out.printf("입력하신 문자 %c 은/는 숫자입니다.", ch);
		}
		else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.printf("입력하신 문자 %c 은/는 알파벳입니다.", ch);
		}
		// 한글
		else if (ch >= '가' && ch <= '힣') {
			System.out.printf("입력하신 문자 %c 은/는 한글입니다.", ch);
		}
		
		else
			System.out.printf("입력하신 문자 %c 은/는 특수문자입니다.", ch);
		}
	}


