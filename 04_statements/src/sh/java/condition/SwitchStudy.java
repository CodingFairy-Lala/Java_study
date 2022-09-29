package sh.java.condition;

import java.util.Scanner;

/**
 * 
 * switch(변수|계산식){
 *   case 값1 : 실행문1; break;
 *   case 값2 : 실행문2; break;
 *   case 값3 : 실행문3; break;
 *   default: 기본실행문;
 * }
 *
 * - 변수 | 계산식 : 값으로 평가될수 있는 구문. byte/short/char/int/String(1.7부터)/enum만 가능.
 *   - long/float/double/boolean은 사용불가
 *
 */
public class SwitchStudy {

	public static void main(String[] args) {
		SwitchStudy study = new SwitchStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	
	/**
	 * 학점예제 switch
	 * 
	 * A : 90 ~ 100
	 * B : 80 ~ 89 
	 * C : 70 ~ 79
	 * D : 60 ~ 69
	 * F : ~ 59
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = ' '; // NULL문자
		
		switch(score / 10) {
		case 10 : 
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'B'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F';
		}
		System.out.printf("당신의 학점은 [%c]입니다.", grade);
		
	}
	
	
	/**
	 * switch - fall through
	 * - break키워드가 없다면, 다음 case문을 연달아 실행한다.
	 * - break란? 현재 중괄호 블럭을 탈출해라.
	 * 
	 * 회원추석선물
	 * 1. Gold : 올리브유, 참기름, 참치
	 * 2. Silver : 참기름, 참치
	 * 3. Bronze : 참치 
	 * 
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원등급을 입력하세요. (1.Gold 2.Silver 3.Bronze)");
		System.out.print("숫자입력 : ");
		String choice = sc.next();
		String present = "";
		
		switch(choice) {
		case "1" : present += "올리브유,";
		case "2" : present += "참기름,";
		case "3" : present += "참치"; break;
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
		
		System.out.printf("회원님의 추석선물은 [%s]입니다.\n", present);
		
	}
	
	/**
	 * 변수의 생명주기 LifeCycle
	 * - block scope
	 *   - block안에 선언된 변수는 block 밖에서 접근할 수 없다.
	 *   
	 * - if블럭, switch 블럭, for블럭
	 */
	public void test3() {
		int num = 100;
		
		int x = 1;
		
		if(true) {
			String str = "abc";
			System.out.println(str);
			
			num = 200;
			System.out.println(num);
			
//			int x = 1; // (X) 변수명 중복
			
		}
		// System.out.println(str); // 접근 불가!
		
		System.out.println(num);
		
		
		int m;
		if((int) (Math.random() * 2) == 0) {
			m = 100;
			System.out.println(m);
		}
		// System.out.println(m); // 값대입이 안되는 경우가 있을수 있으므로, 문법오류
	}
	
	/**
	 * @실습문제 :  메뉴선택시 다음과 같이 출력하라.
	 * ------------------------------------
	 * 선택하신 [순대국]은 [8000]원입니다.
	 * 
	 */
	public void test2() {
		String menu = "====================\n"
					+ "1.순대국 ------ 8000원\n"
					+ "2.된장찌게 ----- 8500원\n"
					+ "3.순두부찌게 --- 9000원\n"
					+ "--------------------\n"
					+ "선택 : ";
		System.out.print(menu);
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		String name = "";
		int price = 0;
		
		switch(choice) {
		case "1" : 
			name = "순대국";
			price = 8000;
			break;
		case "2" : 
			name = "된장찌게";
			price = 8500;
			break;
		case "3" : 
			name = "순두부찌게";
			price = 9000;
			break;
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
		
		System.out.printf("선택하신 [%s]은 [%d]원입니다.", name, price);
		
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 과일을 선택하세요. (1.사과 2.바나나 3.아보카도)");
		System.out.print("선택 : ");
		String choice = sc.next();
		int price = 0;
		switch(choice) {
		case "1" : 
			price = 2000; 
			break; // switch블럭 빠져나간다.
		case "2" : price = 3000; break;
		case "3" : price = 3500; break;
		default : System.out.println("잘못 입력하셨습니다."); return; // 조기리턴. 메소드호출부
		}
		System.out.println("선택하신 과일의 가격은 [" + price + "]원 입니다.");
	}
}














