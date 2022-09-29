package sh.java.array;

public class ArrayStudy {


	public static void main(String[] args) {
		ArrayStudy study = new ArrayStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
	}
	
	/**
	 * 배열의 특징
	 *  - heap 영역에 생성되는 객체이다.
	 *    - hashCode 값을 갖는다.
	 *    - toString 을 통해 객체 정보를 확인할 수 있다.
	 *  - 크기를 변경할 수 없다.
	 *  - 삭제는 Garbage Collector에 의해 처리한다.
	 *    - 주소값을 제거만 가능. 실제 메모리상의 삭제는 GC가 처리한다.
	 */
	
	public void test6() {
		int[] arr = new int[5];
		int[] arr2 = new int[10];
		
		// hashCode
		System.out.println(arr.hashCode()); // 객체의 식별 코드
		System.out.println(arr2.hashCode());

		// toString() : 객체 정보를 문자열로 출력해야 할 때 자동으로 호출
		System.out.println(arr); // @type@hashCode(16진수) // [I : 1차원 배열의 int 라는 의미
		System.out.println(arr.toString());
		
		// 배열 크기 변경 불가
		// 크기 변경이 아니라, 새 배열을 할당
		arr = new int[7];
		System.out.println(arr.hashCode()); // hashCode 바뀜
		
		// 객체 삭제 - 주소 값을 삭제하고, 연결이 끊어진 객체는 GC에 의해 제거
		arr = null;  // 연결하는 주소 값을 끊어버리는 방식
		
		// NullPointerException 주의
		System.out.println(arr); // null
//		System.out.println(arr.length); // NPE  -> . 앞의 객체가 null인지 확인할 것!
//		System.out.println(arr[0]); // NPE
	}
	
	
	/**
	 * @실습문제 : 알파벳 소문자 배열을 생성하고, 출력
	 * -반복문 사용해서 값 대입할 것!
	 */
	
	public void test5() {
		char[] abc = new char[26];
		for(int i = 0; i < abc.length; i++) {
			abc[i] = (char)(97 + i);
		}
		for(char check : abc) {
			System.out.print(check + " ");
		}
	}
	
	
	/**
	 * String[]
	 * - 참조형이지만, 기본형 배열처럼 사용 가능
	 */
	
	public void test4() {
//		 String[] names = new String[3];
		
		// 값 대입 - 모든 참조형의 기본값은 null이다.
//		names[0] = "홍길동";
//		names[1] = "신사임당";
//		names[2] = "이순신";
		
		String[] names = {"홍길동", "신사임당", "이순신"};
		
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	
	/**
	 * 배열에 값 대입
	 * - 배열 요소간의 규칙성이 있다면, 반복문을 통해 값 대입이 가능하다.
	 * - {'A', 'B', 'C', 'D', 'E'}
	 * 
	 */
	
	public void test3() {
//		char[] arr; // stack에 arr 변수 생성
//		arr = new char[5]; // heap에 char배열(길이5) 생성 후, 주소값을 arr에 대입
		char[] arr = new char[5];
		
		// arr[0] = 'A'
		// arr[1] = 'B'
		// arr[2] = 'C'
		// arr[3] = 'D'
		// arr[4] = 'E'
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)(65 + i);
		}
		
		//foreach 문
		for(char check : arr) {
			System.out.println(check);
		}
		
	}
	
	
	
	/**
	 * 배열 초기화
	 * - 배열 변수 선언 + 배열 객체 할당 + index 별 값 대입
	 */
	
	public void test2() {
		int[] scores = {100, 90, 80, 75, 55};
//		int[] scores = new int[]{100, 90, 80, 75, 55};
		
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] = %d\n", i, scores[i]);
		}
		
		//향상된 for 문 : foreach문 (index를 통한 처리가 필요 없는 경우)
		//for(변수 : 배열){} - 변수? 배열의 요소를 하나 담을 변수
		for(int score : scores) {
			System.out.println(score);
		}
		
	}
	
	
	
	/**
	 * 배열 사용 순서
	 * 1. 배열 변수 선언
	 * 2. 배열 할당 (heap 메모리)
	 * 3. index 별 값 대입
	 * 4. 사용
	 * 
	 * 홍길동의 시험점수
	 * - 국어 100
	 * - 영어 90
	 * - 수학 80
	 * - 사회 75
	 * - 과학 55
	 */
	
	public void test1() {
		// 1. 배열 선언
		int[] scores; // 참조형 - 객체에 대한 주소
//		int scores[]; -> C 언어 스타일..
		
		// 2. 배열 할당 - 크기 지정 (값 변경 안되므로 잘 정해야함)
		scores = new int[5];
		
		// 3. index 별 값 대입
		// heap 영역은 변수를 지정할때 타입별 기본 값으로 초기화된다.
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 75;
		scores[4] = 55;
		
		// 4. 사용
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		// 총점 / 평균
		int sum = 0;
		System.out.println("배열의 길이 : " +scores.length);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i + " : " +scores[i]);
			sum += scores[i];
		}
		
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ sum / scores.length);
		
		}	
	
}
