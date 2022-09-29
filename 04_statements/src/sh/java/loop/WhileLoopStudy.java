package sh.java.loop;

import java.util.Random;
import java.util.Scanner;

public class WhileLoopStudy {

	public static void main(String[] args) {
		WhileLoopStudy study = new WhileLoopStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();

	}
	
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		String menu = "======== Game =========\n"
				+ "1. 구구단 \n"
				+ "2. 가위바위보 \n"
				+ "=======================\n"
				+ "선택 : ";
				
		do {
			System.out.print(menu);
			String choice = sc.next();
			switch(choice) {
			case "1" : 	gugudan(); break;
			case "2" : 	rps(); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.print("계속 하시겠습니까? (y/n) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'n') {
				System.out.println("종료...");
				break;
			}
				 
		} while(true);
	}
	
	// 가위바위보
	public void rps() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");

		int userNo = sc.nextInt();
		int comNo = rnd.nextInt(3) + 1;

		String user = userNo == 1 ? "가위" : (userNo == 2 ? "바위" : "보");
		String com = comNo == 1 ? "가위" : (comNo == 2 ? "바위" : "보");

		System.out.println("======= 결과 =======");
		System.out.println("당신은 " + user + "를 냈습니다");
		System.out.println("컴퓨터는 " + com + "를 냈습니다");
		System.out.println("===================");

		// 실행결과
//		if (comNo == userNo)
//			System.out.print("비겼습니다.");
//		else if (comNo == 1 && userNo == 2)
//			System.out.print("당신이 이겼습니다.");
//		else if (comNo == 2 && userNo == 3)
//			System.out.print("당신이 이겼습니다.");
//		else if (comNo == 3 && userNo == 1)
//			System.out.print("당신이 이겼습니다.");
//		else if (comNo == 1 && userNo == 3)
//			System.out.print("당신이 졌습니다.");
//		else if (comNo == 2 && userNo == 1) 
//			System.out.print("당신이 졌습니다.");
//		else if (comNo == 3 && userNo == 2)
//			System.out.print("당신이 졌습니다.");
		
		if (comNo == userNo)
			System.out.print("비겼습니다.");
		else if ((comNo == 1 && userNo == 2) || (comNo == 2 && userNo == 3) || (comNo == 3 && userNo == 1))
			System.out.print("당신이 이겼습니다.");
		else if ((comNo == 1 && userNo == 3) || (comNo == 2 && userNo == 1) || (comNo == 3 && userNo == 2))
			System.out.print("당신이 졌습니다.");
	}
	
	// 구구단
	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력(1 ~ 9) : ");
		int n = sc.nextInt();
		
		int i = 1;
		while(i < 10) {
			System.out.printf("%d * %d = %d\n", n, i, (n * i));
			i ++;
		}
	}
	
	
	/**
	 * do ~ while
	 * - 기존 반복문 조건식 - 실행구문의 순서와 다르게
	 *   실행 - 조건식 순서로 처리함.
	 */
	public void test3() {
//		Scanner sc = new Scanner(System.in);
//		String menu = "메뉴선택 (1. 입금  2. 출금  3. 계좌이체  0. 종료) : ";
//		String choice = "";
//		while(! choice.equals("0")) {
//			System.out.print(menu);
//			choice = sc.next();
//			System.out.println(choice + "번을 선택하셨습니다.");
//			
//		}
		Scanner sc = new Scanner(System.in);
		String menu = "메뉴선택 (1. 입금  2. 출금  3. 계좌이체  0. 종료) : ";
		String choice = ""; // while 조건식에 사용할변수는 do 블럭 바깥에 선언한다.
		do {
			System.out.print(menu);
			choice = sc.next();
			System.out.println(choice + "번을 선택하셨습니다.");
		} while(! choice.equals("0"));
		System.out.println("종료");

	}
	
	
	/** 
	 * 구구단 출력
	 * - 사용자가 원하는 단수의 구구단 출력
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력(1 ~ 9) : ");
		int n = sc.nextInt();
		int i = 1;
		while(i < 10) {
			System.out.printf("%d * %d = %d\n", n, i, (n * i));
			i ++;
		}
	}

	
	/**
	 * 초기식
	 * while(조건식) {
	 *	//실행 구문
	 *
	 *	증감식
	 *	}
	 */
	
	public void test1() {
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		int i = 1;
		while (i <=10) {
			System.out.println(i);
			i++;
		}
		
		// 10 9 8 7 6 5 4 3 2 1
		int i1 = 10;
		while (i1 > 0) {
			System.out.print(i1 + " ");
			i1 --;
		}
		System.out.println();
		 
		// 1 3 5 7 9 11 13 15 17 19
		int i2 = 1;
		while (i2 < 20) {
			System.out.print(i2 + " ");
			i2 += 2;
		}
		System.out.println();
		
		// 20 18 16 14 12 10 8 6 4 2
		int i3 = 20;
		while (i3 > 0) {
			System.out.print(i3 + " ");
			i3 -= 2;
		}
		
	}

}
