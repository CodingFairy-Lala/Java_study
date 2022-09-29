package sh.java.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 study = new Test5();
		study.test();
	}
	
	/**
	 * [문제5]
- 클래스 : sh.java.test.array.Test5.java
- 메소드명 : public void test()
    주민등록번호 성별자리 이후부터 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 
    변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - Arrays.copyOf() 매소드 이용
       - clone() 매소드 이용
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		char[] userNo = new char[13];
		System.out.print("주민등록번호를 입력하세요. : ");
		userNo = sc.next().toCharArray();
		
		
		// for문이용 1:1대입
	//			char[] data = new char[11];
	//			for(int i = 0; i < userNo.length; i++)
	//				data[i] = userNo[i]; 
	//			// System.arraycopy() 매소드 이용
	//			char[] data = new char[userNo.length];
	//			System.arraycopy(userNo, 0, data, 0, userNo.length);
		// Arrays.copyOf() 매소드 이용
	//			char[] data = Arrays.copyOf(userNo, userNo.length);
		// clone() 매소드 이용
		char[] data = userNo.clone();
		
		// 성별자리 이후를 *로 가리기
		for(int i = 7; i < 13; i++) {
			data[i] = '*';
		}
		
		for(char check : data) 
			System.out.print(check);
	

	}
	
}
