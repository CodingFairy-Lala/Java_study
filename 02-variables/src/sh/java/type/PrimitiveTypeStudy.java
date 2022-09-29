package sh.java.type;

/**
 * <pre>
 * 변수란? 메모리공간에 하나의 값을 저장하기 위한 공간
 * 
 * 1. 기본형
 *   - 실제값(literal)을 저장
 *   - 타입에 따라 1byte ~ 8byte까지 크기가 다름.
 * 2. 참조형
 *   - 주소값을 저장
 *   - 기본형 8가지를 제외한 모든 타입(클래스)
 *   - 4byte고정 
 * 
 * 기본형
 * - 문자형 char(2byte) 2^16 0 ~ 65535
 * 
 * - 정수형 
 *   - byte(1byte) 2^8 -128 ~ 127
 *   - short(2byte) 2^16 -32768 ~ 32767
 *   - int(4byte) 기본형 2^32 -2147483648 ~ 2147483647
 *   - long(8byte) 2^64 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
 * 
 * - 실수형
 *   - float(4byte) 가수부 7자리까지 유효
 *   - double(8byte) 기본형 가수부 16자리까지 유효
 * 	 - 실수형은 지수표현식으로 저장. 가수부 + 지수부 
 * 
 * - 논리형
 * 	 - boolean(1byte) true | false
 * 
 * 
 * </pre>
 */
public class PrimitiveTypeStudy {

	public static void main(String[] args) {
		PrimitiveTypeStudy study = new PrimitiveTypeStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	
	/**
	 * Data Overflow
	 * - 한정된 범위에서 더하기 연산결과 최소값으로 다시 떨어지는 현상 
	 */
	public void test5() {
		int i = Integer.MAX_VALUE;
//		i = i + 1; // -2147483648
		i = i + 2; // -2147483647
		System.out.println(i);
		
	}
	
	/**
	 * 상수 Constant Variable
	 * - 값이 한번 대입한 후에는 변경불가한 변수
	 * - final키워드 사용
	 * - 관례적으로 변수명을 모두 대문자로 작성
	 */
	public void test4() {
		int n = 1;
		n = 2;
		n = 3;
		System.out.println(n);
		
		
		final int AGE = 20;
//		AGE = 21; // The final local variable AGE cannot be assigned. It must be blank and not using a compound assignment
		
		final double WEIGHT;
		WEIGHT = 55.5;
//		WEIGHT = 55.5;
		
		System.out.println(AGE);
		System.out.println(WEIGHT);
		
		int yourAge = AGE + 1;
		System.out.println(yourAge);
		
		// jdk가 제공하는 타입별 상수
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		// 단위가 큰 숫자 그룹핑 표현식
		int won = 1_000_000_000;
		System.out.println(won + 100);
		
	}

	/**
	 * 초기화
	 * - 변수선언, 값대입 동시에 처리
	 */
	public void test3() {
		int num = 123;
		boolean bool = 123 > 100;
		double d;
	
		System.out.println(num);
		System.out.println(bool);
//		System.out.println(d); // The local variable d may not have been initialized
	}

	/**
	 * 변수명명 
	 * - 직관적인 변수명을 선정해야한다. 
	 * - a b c d 변수명은 좋지 않다. 
	 * - userName, userEmail,
	 * productCode...
	 */
	public void test2() {
		char gender;
		boolean isMarried;
		int user_age; // 특수문자 _ $만 가능
		double 몸무게;

		gender = '남';
		isMarried = false;
		user_age = 10;
		몸무게 = 78.123;
	}

	/**
	 * 변수 사용법 1. 변수 선언 2. 값대입 3. 사용(출력, 다른연산에 값)
	 */
	public void test1() {
		// 1. 변수 선언
		char ch;
		boolean bool;
		byte bnum;
		short snum;
		int inum;
		long lnum;
		float fnum;
		double dnum;

		// 2. 값대입
		// 대입연산자 : 좌항의 공간에 우항의 값을 대입해라.
		ch = 'a';
		ch = 'b';
		bool = ('a' == 'A'); // false로 평가된다.
		bnum = 123;
		snum = -30000;
		inum = 123456789;
		lnum = 123456789012345L; // l 또는 L로 long타입을 명시. 정수 기본형은 int다.
		fnum = 123.4567890123F; // f 또는 F로 float타입을 명시. 실수 기본형은 double이다.
		dnum = 0.12345678901234567890;

		// 3. 사용
		System.out.println(ch);
		System.out.println(bool);
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum); // 0.12345679
		System.out.println(dnum); // 0.12345678901234568

	}
}
