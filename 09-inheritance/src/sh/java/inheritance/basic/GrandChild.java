package sh.java.inheritance.basic;

/**
 * 
 * 자바에서는 단일상속만 지원한다.
 *
 */
public class GrandChild extends Child {

	@Override
	public void say() {
		System.out.println("손자입니다.");
	}
}
