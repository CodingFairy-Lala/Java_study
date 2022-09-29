package sh.java.loop;

import java.util.Scanner;

/**
 * 
 * for(초기식; 조건식; 증감식){ // 반복실행할 명령어 } 
 * - 초기식 : 증감변수 선언. 최초1회만 실행. 
 * - 조건식 : true면
 * for블럭 실행, false면 for블럭 탈출! 
 * - 증감식 : 증감변수의 가감처리
 *
 */
public class ForLoopStudy {

	public static void main(String[] args) {
		ForLoopStudy study = new ForLoopStudy();
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
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 */
	public void test8() {
		for(int i = 11; i <= 20; i++) {
			System.out.print(i + " ");
			if (i == 15)
				System.out.println();
		}
	}

	/**
	 * 무한반복
	 * - 매턴마다 계속할지 여부를 사용자가 결정하게함.
	 */
	public void test7() {
		Scanner sc = new Scanner(System.in);
		String menu = "---------------------\n"
					+ "1. 떡뽁이 ------ 5000원\n"
					+ "2. 순대 -------  4500원\n"
					+ "3. 오뎅 -------  3500원\n"
					+ "4. 튀김 -------  4000원\n"
					+ "---------------------\n"
					+ "선택 : ";
		
		
		int totalPrice = 0;
		
		for(;;) {
			System.out.print(menu);
			String choice = sc.next();
			
			switch(choice) {
			case "1" : 
				System.out.println("떡뽁이를 선택하셨습니다.");
				totalPrice += 5000;
				break;
			case "2" : 
				System.out.println("순대를 선택하셨습니다.");
				totalPrice += 4500;
				break;
			case "3" : 
				System.out.println("오뎅를 선택하셨습니다.");
				totalPrice += 3500;
				break;
			case "4" : 
				System.out.println("튀김를 선택하셨습니다.");
				totalPrice += 4000;
				break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
			
			System.out.print("계속 하시겠습니까?(y/n) : ");
			char yn = sc.next().charAt(0);
			if(yn == 'n') {
				break;
			}
		}
	
		System.out.println("총 결제금액은 [" + totalPrice + "]원입니다.");
		System.out.println("종료합니다...");
	}
	
	/**
	 * @실습문제 : 
	 * - 사용자가 입력한 두수사이의 합을 구하세요.
	 * 
	 * 정수1 : 5
	 * 정수2 : 10
	 * 
	 * 5에서 10사이의 정수의 합은 45입니다.
	 */
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int m = sc.nextInt();
		System.out.print("정수2 : ");
		int n = sc.nextInt();
		
		int start = m < n ? m : n;
		int end = m > n ? m : n;
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		System.out.printf("%d에서 %d사이의 정수의 합은 %d입니다.", start, end, sum);
		
		
	}
	
	/**
	 * 1 ~ 10 사이의 정수합 구하기
	 */
	public void test5() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i + ", " + sum);
		}
		System.out.println(sum);
	}
	
	/**
	 * 사용자가 반복횟수 결정하기
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name= sc.next();
		System.out.print("반복횟수 : ");
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(name + (i + 1));
		}
		
	}
	
	/**
	 * 구구단
	 * - 3단
	 * 
	 * 3 * 1 = 3
	 * 3 * 2 = 6
	 * 3 * 3 = 9
	 * 3 * 4 = 12
	 * 3 * 5 = 15
	 * ...
	 * 3 * 9 = 27
	 * 
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력(2 ~ 9) : ");
		int n = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, (n * i));
		}
		
	}
	
	public void test2() {
		// 10 9 8 7 6 5 4 3 2 1
		for(int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			System.out.print((10 - i) + " ");
		}
		System.out.println();
		
		// 20 18 16 14 12 10 8 6 4 2
		for(int i = 20; i > 0; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 20; i > 0; i--) {
			if(i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
		
		// 101 102 103 104 105
		for(int i = 101; i <= 105; i++)
			System.out.print(i + " ");
		
		System.out.println();
		
		for(int i = 1; i <= 5; i++)
			System.out.print((100 + i) + " ");

	}

	/**
	 * - 몇 번 반복할건가? 50번
	 * - 증감변수의 범위는? 1 ~ 99 (+2)
	 *   
	 */
	public void test1() {
		
		for(int i = 1; i < 100; i++) {			
			if(i % 2 != 0)
				System.out.println("Hello world " + i);
		}
		for(int i = 1; i < 100; i += 2) {			
				System.out.println("Hello world " + i);
		}
		
	}
}






