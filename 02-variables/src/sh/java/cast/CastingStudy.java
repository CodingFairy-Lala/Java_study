package sh.java.cast;

/**
 * <pre>
 * 컴퓨터 작동원리
 * 1. literal은 동일한 타입의 변수에만 대입가능하다. boolean bool = 123;(X)
 * 2. 동일한 타입 사이에만 연산이 가능하다.
 *   - 타입이 다르다면 암묵적 또는 명시적으로 형변환후에 연산이 가능하다.
 * 3. 동일한 타입간 연산결과 역시 동일한 타입이다.
 * 
 * 자동(암묵적) 형변환
 *   - 형변환시에 데이터손실이 없는 경우 자동으로 형변환해준다.
 * byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
 *            char(2)
 *            
 * 명시적 형변환
 *   - 데이터손실이 있는 경우, 직접 형변환 처리해야한다.
 *   int n = (int) 123.456; // n에 123이 대입된다.
 * 
 * </pre>
 */
public class CastingStudy {

	public static void main(String[] args) {
		CastingStudy study = new CastingStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * @실습문제 : 형변환
	 */
	public void test4() {
		System.out.println('A' + 0); // char + int -> int + int -> 65 + 0  
		System.out.println('0' + 0); // char + int -> int + int -> 48 + 0 
		System.out.println((int) 'x'); // 120
		
		System.out.println(2.0 == 5 / 2); // double == (int / int) -> double == int -> double == double
		System.out.println('C' == 67); // char == int -> int == int
		System.out.println('a' == 'b' - 1); // char == (char - int) -> char == (int - int) -> int == int
		System.out.println('a' != 97); // 부정연산자(같지 않으면 true, 같으면 false) char != int -> int != int
		
		boolean bool = true;
		bool = !bool;
		System.out.println(bool);
	}
	
	/**
	 * 자동형변환 예외상황
	 * - int(4byte) 하위의 자료형(byte, short, char)은 연산시 모두 int로 변환되어 처리된다.
	 * - int값을 char변수에 형변환 없이 대입가능
	 * 
	 */
	public void test3() {
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2); // byte + byte -> int + int -> int
		System.out.println(b3);
		
		char a = 'a'; // 97
		char b = 'b'; // 98
		System.out.println(a + b);
		
		char A = (char) 65; // (char) 생략해도 잘 작동한다.
		System.out.println(A);
		
		// char + 문자열 -> 문자열
		// char + 정수 -> 정수
		System.out.println('a' + "bcdefu"); // "abcdefu"
		System.out.println('a' + 10000); // 10097
		System.out.println(100 + 'a' + "bcd"); // 197bcd
		System.out.println(100 + ('a' + "bcd")); // 100abcd
		
	}
	
	/**
	 * 명시적 형변환
	 */
	public void test2() {
		// 데이터 손실이 있는 형변환
		double dnum = 123.456;
		int inum = (int) dnum;
		System.out.println(inum);
		
		// 더 큰 타입으로 명시적 형변환
		int a = 10;
		int b = 4;
		int c = a / b; // a를 b로 나눈 몫
		System.out.println(c); // 2
		
		double d = (double) a / b; // 10.0(double) / 4(int) -> 10.0 / 4.0 -> 2.5
		System.out.println(d);
		
		// data overflow 되지 않고, 2147483648
		int i = Integer.MAX_VALUE; // 2147483647
		System.out.println(i + 1); // -2147483648
		System.out.println((long) i + 1); // 2147483648  long + int -> long + long -> long
		System.out.println(i + 1L); // 2147483648
	}
	
	/**
	 *  자동형변환
	 */
	public void test1() {
		byte bnum = 100;
		int n = bnum; // 좌항의 공간에 우항의 값을 대입하라. n공간에 bnum변수의 값을 대입.
		System.out.println(n);
		
		int a = 3;
		double b = 2.5;
		System.out.println(a + b); // 3(int) + 2.5(double) -> 3.0(double) + 2.5(double) = 5.5(double)
		
		char ch = 'a';
		int chNum = ch; // char -> int
		System.out.println(chNum); // 97
		
		// ascii code table : 문자 -> 숫자 매핑표 0 ~ 127
		char han = '韓';
		int hanNum = han;
		System.out.println(hanNum);
		
		System.out.println('B' + 100); // char + int -> int + int
		
	}
}









