package sh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopStudy {

	public static void main(String[] args) {
		NestedLoopStudy study = new NestedLoopStudy()	;
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
		study.test7();
	}

	/**
	 * @실습문제
	 * 
	 * 🍑🍑🍑
	 * 🍑
	 * 🍑🍑🍑
	 * 🍑
	 * 🍑🍑🍑
	 */
	public void test7() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3 ; j++) {
				System.out.print("🍑");
			if (i % 2 != 0) {
				break;
				}
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 🧸
	 * 🧸🧸
	 * 🧸🧸🧸
	 * 🧸🧸🧸🧸
	 * 🧸🧸🧸🧸🧸
	 */
	
	public void test6() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i ; j++) {
				System.out.print("🧸");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 중첩 반목문에서의 break/continue
	 * - 반복문에 라벨 붙이기
	 */
	
	public void test5() {
		gugu :
		for(int dan = 2; dan <= 9; dan++) {
			for(int n = 1; n <= 9; n++) {
				if(dan * n > 50)
					break gugu; // gugu 반복문을 break
				System.out.printf("%d * %d = %d\n", dan, n, dan * n);
			}
			System.out.println();
		}
		
		outer:
		for(int dan = 2; dan <= 9; dan++) {
			for(int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d\n", dan, n, dan * n);
				
				if(dan == n) {
					System.out.println();
					continue outer;
				}
			}
		
		}
	}	

	/**
	 * 구구단 전체 출력
	 */
	
	public void test4() {
		for(int dan = 2; dan <= 9; dan++) {
			for(int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d = %d\n", dan, n, dan * n);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * <pre>
	 * @실습문제 : 사용자로부터 행, 열, 특수문자를 받아
	 * 			별찍기 출력
	 * 예) 행 :4
	 * 	  열 :3
	 * 	  문자 : ㅇ
	 * 
	 *   ㅇㅇㅇ
	 *   ㅇㅇㅇ
	 *   ㅇㅇㅇ
	 *   ㅇㅇㅇ
	 *   </pre>
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int ver = sc.nextInt();
		System.out.print("열 : ");
		int hor = sc.nextInt();
		System.out.print("문자 : ");
		String text = sc.next();
		
		for(int i = 0; i < ver; i++) {
			for(int j = 0; j < hor; j++) {
				System.out.printf(text);
			}
			System.out.println();
		}
	}
	
	public void test2() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("");
			}
			System.out.println();
		}
	}
	
	/**
	 * 중첩 반복문
	 * - 다차원적인 데이터를 처리할 수 있다.
	 * - 행열 정보 출력 가능
	 */
	
	public void test1() {
		for(int i = 0; i < 3; i++) {
			System.out.println();
			for(int j = 0; j < 5; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
		}
	}
}
