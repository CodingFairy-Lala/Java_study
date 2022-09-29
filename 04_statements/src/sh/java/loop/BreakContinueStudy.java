package sh.java.loop;

public class BreakContinueStudy {


	public static void main(String[] args) {
		BreakContinueStudy study = new BreakContinueStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * 1 ~ 100 사이의 홀수만 출력
	 * 1 ~ 100 사이의 짝수만 출력
	 */
	public void test3() {
		// 홀수 for (짝수인 경우 continue)
		for(int i = 0; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 홀수 while (짝수인 경우 continue)
		int i2 = 0;
		while(i2++ < 100) {
			if(i2 % 2 == 0) 
				continue;
			System.out.print(i2 + " ");
		}
		System.out.println();
		
		// 짝수 for (홀수인 경우 continue)
		for(int i3 = 1; i3 <= 100; i3++) {
			if (i3 % 2 != 0)
				continue;
			System.out.print(i3 + " ");
		}
		System.out.println();
		
		// 짝수 while (홀수인 경우 continue)
		int i4 = 1;
		while(i4++ < 100) {
			if(i4 % 2 != 0) 
				continue;
			System.out.print(i4 + " ");
		}
		System.out.println();
		
	}
	
	
	/**
	 * continue
	 * - 반복문 실행시 continue를 만나면, 이하 코드를 실행하지 않고 반복문의 처음으로 돌아간다.
	 * - for문의 증감식으로 이동
	 * - while문의 조건식으로 이동 (continue 하위에 증감식이 있어서는 안된다.)
	 */
	
	public void test2() {
		// 10 이하의 짝수만 출력
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				continue;
			System.out.println(i);
		}
		
		// 5 이하의 짝수만 출력
		int i = 1;
		while(i < 5) {
			i++;
			if(i % 2 != 0) 
				continue;
			System.out.println(i);
		}
	}
	
	
	/**
	 * break
	 * - 반복문을 즉시 중단하고 탈출!
	 */
	public void test1() {
		int i = 0;
//		while(true) {
//			if(i > 100) {
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
		
		int sum = 0;
		i = 1;
		while(true) {
			if(i > 10) {
				break;
			}
//			sum += i;
//			i++;
			sum += i++;
		}
		System.out.println("1 ~ 10 까지의 합은 "+ sum + "입니다.");
		
	}
}
