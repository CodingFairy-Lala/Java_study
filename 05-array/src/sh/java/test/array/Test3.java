package sh.java.test.array;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 study = new Test3();
		study.test();
	}
	/**
	 * [문제3]
- 클래스 : sh.java.test.array.Test3.java
- 메소드명 : public void test()

    문자열을 하나 입력 받아 문자배열에 넣고
    검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지
    개수를 출력하는 프로그램을 작성하세요.
    
    예) 입력값 : helloworld
    검색값 :ㅣ
    출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String str = sc.next();
		char[] charArr = str.toCharArray(); // 문자열 -₩₩₩₩₩> char배열 전환
		System.out.print("검색할 문자를 입력하세요. : ");
		char search =  sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (charArr[i] == search) 
				count ++;
		}
		
		String result = "입력 값 : "+ str + "\n"
				+"검색 값 : " + search + "\n"
				+"출력 : 입력하신 문자열 " + str + "에서 찾으시는 문자 "
				+ search + "은 " + count + "개 입니다.";
		System.out.println(result);
		
	}
}
