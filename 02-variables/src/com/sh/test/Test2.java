package com.sh.test;

public class Test2 {
	public static void main(String[] args) {
		Test2 study = new Test2();
		study.test();
	}
	
	/**
	 * 2. 자신의 신상정보를 저장할 변수를 만들고 정보를 변수에 대입, 출력하는 프로그램을 작성하세요.
(System.out.printf 사용할것.)
     - 이름, 나이, 성별,주소, 전화번호, 이메일      

=======================================================================
이름        나이    성별       전화번호            이메일            주소
=======================================================================
홍길동        22        남        01012341234       hgd@naver.com    경기도 광주시
홍길순        20        여        010123412341   hgs@gmail.com    전라남도 광주시                            

작성한 변수를 재사용해 팀메이트의 정보를 다시 변수에 대입 출력하는 프로그램으로 수정하세요.


com.sh.test.Test2 에 작성
	 */
	
	public void test() {
		String name = "장해라";
		int age = 31;
		char gender = '여';
		String adrs = "서울시 송파구";
		String phNum = "01095559254";
		String email = "blossom.vo.ov@gmail.com";
		
		System.out.println("================================================================");
		System.out.println("이름   나이   성별   전화번호         이메일                 주소");
		System.out.println("================================================================");
		System.out.printf("%s   %d   %c    %s    %s   %s", name, age, gender, phNum, email, adrs);
		
		
	}
}
