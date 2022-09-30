package sh.java.error;

/**
 * 
 * 소스 코드상(예외처리) 복구가 불가능한 오류
 *
 *
 *
 */

public class ErrorStudy {

	public static void main(String[] args) {
		ErrorStudy study = new ErrorStudy();
		// study.test1();
		study.test2();

		System.out.println("정상 종료...");
	}

	/**
	 * StackOverflowError
	 */
	private void test2() {
		System.out.println("test2!!!"); // java.lang.StackOverflowError
		test2();
	}

	/**
	 * OutOfMemoryError - heap 메모리공간을 모두 소진한 경우
	 */

	private void test1() {
		long[] arr = new long[Integer.MAX_VALUE]; // OutOfMemoryError: Requested array size exceeds VM limit

	}

}
