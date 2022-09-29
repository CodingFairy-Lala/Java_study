package com.sh.test;

public class Test1 {
	public static void main(String[] args) {
		Test1 study = new Test1();
		study.test1();
	}

	/**
	 * 1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.

     - 정수형 100, 9999억, 
       - 실수 486.567(float), 567.890123
       - 문자 A
       - 문자열 Hello world, 
       - 논리 true
     
     단, 변수를 이용하여 출력하시오 .

     com.sh.test.Test1 에 작성
	 */
	
	public void test1() {
		int i = 100;
		long lo = 999900000000L;
		float fl = (float) 486.567;
		double db = 567.890123;
		char ch = 'A';
		String st = "Hello world";
		boolean bo = true;
		
		System.out.println(i);
		System.out.println(lo);
		System.out.println(fl);
		System.out.println(db);
		System.out.println(ch);
		System.out.println(st);
		System.out.println(bo);
	}
}
