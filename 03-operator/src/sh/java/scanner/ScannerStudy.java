package sh.java.scanner;

import java.util.Scanner;

/**
 * java.util.Scanner 
 * - 사용자의 키보드 입력을 읽어서 반환
 * - 각타입별로 형변환을 지원하는 메소드 있음.
 * 
 * 1. next계열
 *   - next():String
 *   - nextInt():int
 *   - nextDouble():double
 *   - nextBoolean():boolean
 *   - nextChar는 존재하지 않음.
 *   - 실제 문자열이전에 만난 공백/개행문자는 무시하고, 실제문자열이후 만난 공백/개행문자 전까지만 읽어온다.
 * 
 * 2. nextLine계열
 * 	 - nextLine():String
 *   - 공백이 포함된 문자열인 경우 사용
 *   - 개행문자까지 읽어와서 개행문자는 버리고, 실제입력값 반환
 * 
 */
public class ScannerStudy {

	public static void main(String[] args) {
		ScannerStudy study = new ScannerStudy();
//		study.test1();
		study.test2();
	}
	
	/**
	 * @실습문제 : 사용자의 이름/나이/주소/키/몸무게/성별을 입력받고 마지막에 다음과 출력할 것.
	 * 
	 * --------------
	 * 이름 : 
	 * 나이 : 
	 * 주소 : 
	 * 키 :
	 * 몸무게 : 
	 * --------------
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 개행문자 날리기용
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.print("키(cm) : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg) : ");
		double weight = sc.nextDouble();
		System.out.print("성별(M|F): ");
//		char gender = sc.next().charAt(0);
		String tmp = sc.next();
		char gender = tmp.charAt(0);
		
		System.out.println("-----------------");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("주소 : %s\n", addr);
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("몸무게 : %.1fkg\n", weight);
		System.out.printf("성별 : %c\n", gender);
		System.out.println("-----------------");
		
		
	}
	
	/**
	 * next | nextLine
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in); // System.in 표준입력(키보드입력)
		
		System.out.print("이름 > ");
		String name = sc.next();
		System.out.println("당신의 이름은 [" + name + "]입니다.");
		
//		System.out.print("나이 > ");
//		int age = sc.nextInt();
//		System.out.println("당신의 나이는 [" + age + "]세입니다.");
//		
//		System.out.print("키 (예: 177.7)> ");
//		double height = sc.nextDouble();
//		System.out.println("당신의 키는 [" + height + "]cm입니다.");
//		
//		System.out.print("결혼여부 (true | false)> ");
//		boolean isMarried = sc.nextBoolean();
//		System.out.println("당신의 결혼여부는 [" + isMarried + "]입니다.");
//		
//		System.out.print("성별 (남 | 여)> ");
//		char gender = sc.next().charAt(0);
//		System.out.println("당신의 성별은 [" + gender + "]자 입니다.");
		
		// 개행문자용 날리기용 
		sc.nextLine();
		
		System.out.print("주소 > ");
		String addr = sc.nextLine();
		System.out.println("당신의 주소는 [" + addr + "]입니다.");
	}
}










