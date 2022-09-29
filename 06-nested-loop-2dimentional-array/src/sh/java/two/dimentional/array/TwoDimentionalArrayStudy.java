package sh.java.two.dimentional.array;

public class TwoDimentionalArrayStudy {

	/**
	 * 2차원 배열이란?
	 * - 배열 안의 배열
	 * - 2개의 인덱스를 가진다. 행 인덱스, 열 인덱스
	 * - 중첩반복문을 통해 제어할 수 있다.
	 */
	
	public static void main(String[] args) {
		TwoDimentionalArrayStudy study = new TwoDimentionalArrayStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}

	/**
	 * @실습문제
	 * 아래 학생의 점수를 2차원 배열에 옮겨담고, 각 학생별 평균 점수를 구하라.
	 * 
	 * - 홍길동 90, 70, 55
	 * - 신사임당 100, 95, 100
	 * - 이순신 80, 75, 90
	 * 
	 * tip) 3행4열 2차원배열 사용 / 평균 점수를 4열에 대입후 출력.
	 * 
	 * 출력예시) 		90 70 55 71.1
	 * 				100 95 100 98.3
	 * 				80 75 90 81.7
	 */
	
	public void test4() {
		double[][] scores = {
				{90, 70, 55, 0},
				{100, 95, 100, 0},
				{80, 75, 90, 0}
		};
		
		// 평균
		for(int i = 0; i < scores.length; i++) {
			double[] temp = scores[i];
			temp[3] = (temp[0] + temp[1] + temp[2]) / 3;
		}
		
//		for(int i = 0; i < scores.length; i++) {
//			double avr = 0;
//			for(int j = 0; j < scores[0].length; j++) {
//				avr += scores[i][j];
//				if (j == scores.length) {
//					scores[i][j] = avr/3 ;
//				}
//			}
//		}
		
		
		// 값 출력
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[0].length; j++) {
				System.out.printf("%d ", (int)scores[i][j]);
				if (j == scores.length) 
					System.out.printf("%.1f ", scores[i][j]);
				}
			System.out.println();
		}

		
		// 정수 배열에 담고싶을 때
//		int[][] scores = {
//				{90, 70, 55, 0},
//				{100, 95, 100, 0},
//				{80, 75, 90, 0}
//		};
//		for(int i = 0; i < scores.length; i++) {
//			int avr = 0;
//			for(int j = 0; j < scores[0].length; j++) {
//				avr += scores[i][j];
//				if (j == scores.length) {
//					scores[i][j] = avr*10/3 ;
//				}
//			}
//		}
//		
//		for(int i = 0; i < scores.length; i++) {
//			for(int j = 0; j < scores[0].length; j++) {
//				if (j == scores.length) {
//					System.out.printf("%.1f ", (float)scores[i][j]/10);
//				} else {
//					System.out.printf("%d ", scores[i][j]);
//				}
//			}
//			System.out.println();
//		}
	}
	
	/**
	 * 초기화
	 * - 배열 변수 선언, 배열 객체 할당, 값 대입
	 */
	
	public void test3() {
		int[][] scores = {
				{90, 80, 70},
				{100, 77, 95}
		};
		
		String[][] names = {
				{"홍길동", "홍진경", "홍난파"},
				{"이순신", "이영자", "이대호"}
		};
		
		for(int[] temp : scores){   // temp 배열에 1차원 배열 객체 할당
			for(int score : temp) {   // 각 인덱스에 값 대입
				System.out.print(score + " ");
			}
			System.out.println();
		}

		for(String[] temp : names){
			for(String name : temp) {
				System.out.print(name + " ");
			}
			System.out.println();
		}
		
		
		
	}

	/**
	 * @실습문제
	 *  - 2 * 26 2차원 배열에 알파멧 대소문자 대입후 출력하기
	 *  - 0행 대문자
	 *  - 1행 소문자
	 *  
	 *   * 이클립스 대소문자 변경 c + shift + x / y
	 *   A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
	 *   a b c d e f g h i j k l m n o p q r s t u v w x y z
	 */

	public void test2() {
		char[][] arr;
		arr = new char[2][26];
		char abc1 = 'A';
		char abc2 = 'a';
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if (i < 1) {
					arr[i][j] = abc1;
					abc1 ++;
				} else {
					arr[i][j] = abc2;
					abc2 ++;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
		
		
	
	
	/**
	 * 사용 순서
	 * 1. 배열변수 선언
	 * 2. 배열객체 할당 (크기 지정)
	 * 3. 각 인덱스별로 값 할당
	 * 4. 사용
	 */
	
	public void test1() {
		// 1. 배열변수 선언
		int[][] arr;
		// 2. 배열객체 할당 (크기 지정)
		arr = new int[2][3]; // 2 * 3 6개의 int 공간을 생성. int의 기본값 0으로 세팅.
//		// 3. 각 인덱스 별로 값 할
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//		// 4. 사용
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		// 인덱스별 대입되는 값이 규칙적인 경우, 중첩 반복문을 통해서 값 대입 가능
		int k = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		// 확인하깅
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
