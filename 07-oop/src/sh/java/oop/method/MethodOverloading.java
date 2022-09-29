package sh.java.oop.method;

/**
 * Method overloading
 * - 동일한 기능을 수행하는데, 매개 변수의 타입을 다르게 제공해야 할 때.
 * - 메소드 이름 똑같고, 매개변수 선언부만 다른 형태의 메소드 묶음.
 * 
 *  성립조건
 *  - 메소드 이름이 같고 매개변수 선언부(개수, 타입, 순서)가 어떻게든 달라야 한다.
 *  - 매개변수명, 접근제한자, 리턴타입은 개의치 않는다.
 *  
 *  JVM이 메소드를 호출함에 있어 모호하지 않게 하는것이 중요하다.
 */

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading instance = new MethodOverloading();
		instance.test();
		instance.test(100);
		instance.test(100, 200);
		instance.test("안녕");
		instance.test("안녕", 100);
		instance.test(100, "안녕");
		
	}

	public void test() {}
	public void test(int a) {}
	public void test(int a, int b) {}
	public void test(String str) {}
	public void test(String str, int x) {}
	public void test(int x, String str) {}
	public void test(float a) {}
	public void test(char a) {}
	public void test(double a) {}
	public void test(long a) {}
	public void test(boolean a) {}
	
//	public void test(int m) {}   // 매개변수명은 상관치 않는다. (타입이 같기때문에 오버로딩 되지 않음)
//	private void test(int m) {}   // 접근제한자는 상관치 않는다.
//	public void test(int m) { return 0; }  // 리턴타입은 상관치 않는다.
	
}
