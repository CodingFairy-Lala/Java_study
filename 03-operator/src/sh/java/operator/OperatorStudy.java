package sh.java.operator;

public class OperatorStudy {

	public static void main(String[] args) {
		OperatorStudy study = new OperatorStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
//		study.test7();
		study.test8();
	}
	
	/**
	 * 복합대입연산(산술대입)
	 * - +=
	 * - -=
	 * - *=
	 * - /=
	 * - %=
	 */
	public void test8() {
		int m = 10;
		
//		m = m + 2;
		m += 2; // 12
		
//		m = m -2;
		m -= 5; // 7
		
//		m = m * 5;
		m *= 5; // 35
		
//		m = m / 8;
		m /= 8; // 4
		
//		m = m % 3;
		m %= 3;
		
		System.out.println(m);
		
		
	}
	
	/**
	 * 삼항연산자
	 * (조건식) ? (참일때 사용할 값) : (거짓일때 사용할 값) 
	 * 
	 */
	public void test7() {
		int a = 11;
		int b = 11;
		int c = (a > b) ? a : b;
		System.out.println(c);
		
		// a 가 짝수면, a 출력, a + 1 출력
		int result = (a % 2 == 0) ? a : a + 1;
		System.out.println(result);
		
		// 중첩
		int d = (a > b) ? 
					a : 
						(b > a ? b : 0);
		System.out.println(d);
		
		System.out.println((a % 2 == 0) ? a : a + 1);
		
	}
	
	/**
	 * 논리연산자 연습
	 */
	public void test6() {
		int x = 3;
		int y = 10;
		int a = 10;
		int b = 100;
		
		// 최종 결과가 참인 조건식 5개
		System.out.println(a == y && x < a);
		System.out.println(x + 7 == y || a * 10 != b);
		
		// 최종 결과가 거짓인 조건식 5개
		System.out.println(x == y || a * 10 != b);
		System.out.println(x == y && a * 10 != b);
	}
	
	/**
	 * 이항연산자 - 논리비교연산
	 * - 좌항/우항 모두 논리값이 와야 한다.
	 * - && AND 좌우항이 모두 참인경우, 참.
	 *   - 좌항이 거짓인 경우, 우항을 검사하지 않는다.
	 * - || OR  좌우항중 하나라도 참이면, 참.
	 *   - 좌항이 참인 경우, 우항을 검사하지 않는다.
	 */
	public void test5() {
		int a = 1;
		int b = 1;
		
		// && AND
//		System.out.println(a > 0 && b++ > 0); // 참 && 참
//		System.out.println(a > 0 && b++ == 0); // 참 && 거짓
//		System.out.println(a == 0 && b++ > 0); // 거짓 && 참 (우항 검사 안함)
//		System.out.println(a == 0 && b++ == 0); // 거짓 && 참 (우항 검사 안함)
//		System.out.printf("a = %d, b = %d\n", a, b);
		
		// || OR
//		System.out.println(a > 0 || b++ > 0); // 참 || 참 (우항 검사 안함)
//		System.out.println(a > 0 || b++ == 0); // 참 || 거짓 (우항 검사 안함)
//		System.out.println(a == 0 || b++ > 0); // 거짓 || 참
//		System.out.println(a == 0 || b++ == 0); // 거짓 || 거짓
//		System.out.printf("a = %d, b = %d\n", a, b);
		
		// & AND
		// 좌항이 거짓이어도 우항을 검사하는 AND연산자 
//		System.out.println(a == 0 & b++ == 0); // 거짓 & 참 (우항 검사 무조건 함)
//		System.out.printf("a = %d, b = %d\n", a, b);
		
		// | OR
		// 좌항이 참이어도 우항을 검사하는 OR연산자
		System.out.println(a > 0 | b++ > 0); // 참 | 참 (우항 검사 무조건 함)
		System.out.printf("a = %d, b = %d\n", a, b);
		
	}
	
	/**
	 * 이항연산자 - 비교연산
	 */
	public void test4() {
		int a = 5, b = 3;
		
		System.out.println(a > b); // 크다 gt Greater than
		System.out.println(a < b); // 작다 lt Less than
		System.out.println(a >= b); // 크거나 같다 ge Greater than or Equal To
		System.out.println(a <= b); // 작거나 같다 le Less than or Equal To
		
		// 동등비교연산
		System.out.println(a == b); 
		System.out.println(a != b);
		
	}
	
	/**
	 * 이항연산자 - 산술연산
	 */
	public void test3() {
		int a = 10;
		int b = 4;
		
		int result = a + b;
		System.out.println(result);
		
		result = a - b;
		System.out.println(result);
		
		result = a * b;
		System.out.println(result);
		
		result = a / b; // 몫
		System.out.println(result);
		
		result = a % b; // 나머지
		System.out.println(result);
		
		result = a + b * 10; // a + (b * 10)
		result = (a + b) * 10;
		System.out.println(result);
		
		boolean isEven = a % 2 == 0;
		System.out.println(isEven);
		
//		boolean isOdd = a % 2 != 0;
		boolean isOdd = a % 2 == 1;
		System.out.println(isOdd);
		
	}
	
	
	
	/**
	 * @실습문제
	 */
	public void test2() {
		int x = 10;
		int y = 10;
		int z = ++x;
		
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		
		z = y++;
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		x = 20;
		z = x++ + --y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		
		int m = 3;
		int n = m++ + m;
		System.out.println("m = " + m);
		System.out.println("n = " + n);
	}
	
	/**
	 * 단항연산자
	 */
	public void test1() {
		int a = +9;
		int b = -10;
		System.out.println(a + b); // -1
		
		// 증감연산자 ++ --
		// 해당변수의 값을 1증가, 1감소
		int c = 5;
		c++;
		System.out.println(c);
		c--;
		System.out.println(c);
		
		// 전위증감연산자 ++x --x : 먼저 1을 증감시킨후, 인접연산에 사용된다.
		// 후위증감연산자 x++ x-- : 인접연산에 먼저 사용된후, 1을 증감처리.
		int x = 10;
		++x;
		System.out.println(x); // 11
		--x;
		System.out.println(x); // 10
		
		int y = 3;
		int z = x + ++y; // 14
//		int z = x + y++; // 13
		System.out.println("z = " + z); 
		System.out.println("y = " + y); 
		
	}
}
