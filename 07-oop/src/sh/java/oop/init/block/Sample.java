package sh.java.oop.init.block;

/**
 * 초기화 블럭
 *  - 전역변수의 값 대입을 위한 코드 실행블럭
 * 1. 인스턴스 변수용 초기화 블럭
 * 2. 클래스 변수용 초기화 블럭
 * 
 * 인스턴스 변수의 값 대입 절차
 * 1. 타입별 기본값 대입
 * 2. 명시한 초기값 대입
 * 3. 초기화 블럭의 값 대입
 * 4. 생성자 메소드의 값 대입 (객체를 만들때 호출됨)
 *
 * 클래스 변수의 값 대입 절차 -> 프로그램 실행시 가장 먼저 메모리에 올라가있음. (가장 빨리 실행됨!)
 * 1. 타입별 기본값 대입
 * 2. 명시한 초기값 대입
 * 3. static 초기화 블럭의 값 대입
 * 
 */

public class Sample {
	int num = 1;  // 인스턴스 변수
	static int snum = 9;  // 클래스 변수
	
		
	{
		System.out.println("[초기화블럭 실행 전] : " + num);
		// 인스턴스 변수의 초기화 블럭
		num = 2;
		System.out.println("[초기화블럭 실행 후] : " + num);
	}
	
	static {
		System.out.println("[static 초기화블럭 실행 전] : " + snum);
		// 클래스 변수의 초기화 블럭
		snum = 99;
		System.out.println("[static 초기화블럭 실행 전] : " + snum);
	}
	
	/**
	 * 생성자 메소드
	 * - new 연산자에 의해 호출되는 메소드
	 * - 리턴 타입이 없고, 클래스명과 반드시 같아야 한다.
	 * 
	 */
	public Sample() {
		System.out.println("[생성자 메소드 실행 전] : " + num);
		num = 3;
		System.out.println("[생성자 메소드 실행 후] : " + num);
	}
	
	
}
