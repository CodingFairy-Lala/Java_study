package sh.java.oop.access.modifier.field;

/**
 * 접근 제한자
 * - private 해당 클래스 밖에서 직접 접근 불가
 * - default(package) 아무것도 작성하지 않은 경우. 같은 패키지에서 접근 가능
 * - protected 같은 패키지에서 접근 가능. 자식 클래스인 경우, 다른 패키지에서도 접근 가능.
 * - public 어디에서든 접근 가능
 *
 */

public class Foo {
	public int a = 1;
	protected int b = 2;
	int c = 3;   // default
	private int d = 4;
	
	public void k() {
		System.out.println("k");
	}
	protected void l() {
		System.out.println("l");
	}
	void m() {
		System.out.println("m");
	}
	private void n() {
		System.out.println("n");
	}
	
	
	
}
