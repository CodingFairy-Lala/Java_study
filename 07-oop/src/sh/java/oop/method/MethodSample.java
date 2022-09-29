package sh.java.oop.method;

public class MethodSample {

	private int n = 10;
	private static int s = 99;
	
	public static void main(String[] args) {
		MethodSample sample = new MethodSample();
		System.out.println(sample.n); // 10
		System.out.println(MethodSample.s); // 99
		sample.print();
		System.out.println(sample.n); // 20
		MethodSample.test(); // 99
	}
	
	
	/**
	 * 인스턴스 메소드
	 * - non-static 메소드
	 * - 멤버 메소드
	 * - 인스턴스 변수 / 클래스 변수 모두 사용이 가능
	 * - 현재 객체를 의미하는 숨은 this 참조변수를 가진다.
	 */
	
	public void print() {
		System.out.println(this.n); // 10
		System.out.println(s); // 99
		this.n += 10;
		
		// static 메소드 호출 가능
//		MethodSample.test();
//		test();
	}
	
	/**
	 * 클래스 메소드
	 * - static 메소드
	 * - 객체를 만들지 않고, 클래스명.test()로 호출
	 * - 클래스 변수만 접근 가능
	 * - this 참조변수가 없다.
	 */
	
	public static void test() {
//		System.out.println(n); //Cannot make a static reference to the non-static field n
		System.out.println(s);
	}
	
	
}
