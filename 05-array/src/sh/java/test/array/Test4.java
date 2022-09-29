package sh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 study = new Test4();
//		study.test1();
		study.test2();
	}
	
	
	/**
	 * [문제4]
- 클래스 : sh.java.test.array.Test4.java
- 메소드명 : public void test1()
    사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - Arrays.copyOf() 매소드 이용
       - clone() 매소드 이용
	 */
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		char[] userNo = new char[11];
		System.out.print("전화번호를 입력하세요. : ");
		userNo = sc.next().toCharArray();
		
		
		// for문이용 1:1대입
//		char[] data = new char[11];
//		for(int i = 0; i < userNo.length; i++)
//			data[i] = userNo[i]; 
//		// System.arraycopy() 매소드 이용
//		char[] data = new char[userNo.length];
//		System.arraycopy(userNo, 0, data, 0, userNo.length);
		// Arrays.copyOf() 매소드 이용
//		char[] data = Arrays.copyOf(userNo, userNo.length);
		// clone() 매소드 이용
		char[] data = userNo.clone();
		
		// 가운데 4자리를 *로 가리기
		for(int i = 3; i < 7; i++) {
			data[i] = '*';
		}
		
		for(char check : data) 
			System.out.print(check);

	}
	
	/**
	 * - 메소드명 : public void test2()
    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
	 * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
	 * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.
	 */
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요. : ");
		String str = sc.next();
		String data = str.substring(3, 6);
		data = "****";
		String result = str.substring(0, 3) + data + str.substring(7, 11);
		System.out.println(result);
		

	}
}

