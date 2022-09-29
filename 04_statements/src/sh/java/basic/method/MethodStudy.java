package sh.java.basic.method;

import java.util.Scanner;

public class MethodStudy {

	public static void main(String[] args) {
		MethodStudy study = new MethodStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * @실습문제 
	 * 친구1 이름> 홍길동
	 * 친구2 이름> 신사임당
	 * 친구3 이름> 이순신
	 * -----------------
	 * 친구목록 - 홍길동, 신사임당, 이순신
	 */
	public void test4() {
		int i = 1;
		String name1 = inputName(i++);
		String name2 = inputName(i++);
		String name3 = inputName(i++);
		System.out.println("-----------------------");
		System.out.printf("친구목록 - %s, %s, %s", name1, name2, name3);
		return;
	}
	
	public String inputName(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("친구%d 이름>", n);
		return sc.next();
	}
	
	/**
	 * 두 정수를 입력받고 합을 출력하는 메소드
	 */
	public void test3() {
		int n1 = inputNumber(1);
		int n2 = inputNumber(2);
		System.out.printf("두수의 합은 %d입니다. \n", n1 + n2);
		return; // 모든 void메소드의 마지막엔 return; 구문이 있다.(생략)
	}
	
	public int inputNumber(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수%d> ", n);
		return sc.nextInt(); // return value
	}
	
	public void test1() {
		// 데이터 할당부분
		String name = "홍길동";
		int age = 33;
		
		// 데이터 출력부분
		// 메소드호출부
		// 매개인자 Argument - 메소드호출시 전달되는 값
		this.printPerson(name, age);
	}
	
	public void test2() {
		String name = "신사임당";
		int age = 48;
		this.printPerson(name, age);
//		this.printPerson("신사임당", 48);
	}
	
	/**
	 * 매개변수 Parameter (값을 담기위한 공간)
	 * - 선언 
	 * - 값대입 - 메소드호출시 전달된 값이 대입
	 * @param name
	 * @param age
	 */
	public void printPerson(String name, int age) {
		System.out.printf("안녕하세요, 저는 %s입니다. %d살이에요. 반갑습니다.\n", name, age);
	}
	
	
}
