package com.sh.test.loop;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Test4 study = new Test4();
		study.test();
	}
	
	
	/**
	 * [문제 4]
- 클래스 : com.sh.test.loop.Test4.java
- 메소드명 : public void test()
(문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용할 것)

    문자열과 문자열에서 검색될 문자를 입력 받아 문 
    자열에 그 문자가 몇 개이었는지 개수를 확인하는 
    프로그램을 작성하세요. 
    또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후
    프로그램을 종료하세요. 
    
    출력 예)
       문자열 입력 : application
    검색할 문자 입력 : p
    'p'가 포함된 갯수 : 2 개
    
    
    문자열 입력 : apple_test123
    문자 입력 : ㄱ
    영문자가 아닙니다.
	 */
	

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String word = sc.next();
		System.out.print("검색할 문자 입력 : ");
		char search =  sc.next().charAt(0);
		int count = 0;
		if (search <65) {
			System.out.println("영문자가 아닙니다."); return;
		}
		if (search >122) {
			System.out.println("영문자가 아닙니다."); return;		
		}
		else
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == search) {
					count++;
					}
			}
		String result = "문자열 입력 : "+word+"\n"
				+ "    검색할 문자 입력 : "+search+"\n"
				+ "    '"+search+"'가 포함된 갯수 : "+count+" 개";
		System.out.println(result);
	}
}
