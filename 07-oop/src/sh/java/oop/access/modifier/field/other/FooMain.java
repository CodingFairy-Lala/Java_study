package sh.java.oop.access.modifier.field.other;

import sh.java.oop.access.modifier.field.Foo;

public class FooMain {

	public static void main(String[] args) {
		Foo foo = new Foo();
		System.out.println(foo.a);
//		System.out.println(foo.b); // protected 다른 패키지에서 접근불가 
//		System.out.println(foo.c); // default 다른 패키지에서 접근불가
//		System.out.println(foo.d); // private 클래스 외부 접근불가

		foo.k();
//		foo.l(); // protected 다른 패키지에서 접근불가 
//		foo.m(); // default 다른 패키지에서 접근불가
//		foo.n(); // private 클래스 외부 접근불가
		
	}

}
