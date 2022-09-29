package sh.java.oop.method;


/**
 * 재귀함수 (메소드)
 * - 스스로를 다시 호출하는 메소드
 * - 반복호출을 통해 효율적인 코드작성이 가능하다.
 * - 주의! 종료조건을 제시하지 못하면 무한반복으로 인해 StackOverflowError 발생
 * 
 * - tree구조(메뉴), 주사위 2개 굴리기(두 수가 같으면 한번 더 굴리기), 하노이의 탑 등이 재귀함수 처리에 적합하다.
 */

public class RecursionStudy {

	public static void main(String[] args) {
		RecursionStudy study = new RecursionStudy();
		int result = study.factorial(5);
		System.out.println(result);
		

	}
	
	/**
	 * 5 != 5 * 4 * 3 * 2 * 1
	 * 		long prod = 1;
		for (int i = 5; i > 0; i--) {
			prod *= i;
		}
		System.out.println(prod);
	 */
	public int factorial(int n) {
		if (n == 1)
			return 1; // 재귀함수 호출종료!
		return n * factorial(n - 1);
	}
	
	
}

	
	
