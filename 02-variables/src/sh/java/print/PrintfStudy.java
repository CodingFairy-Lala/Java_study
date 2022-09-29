package sh.java.print;

/**
 * 
 * System.out.printf
 * - 출력형식을 지정
 * - 타입별 형식문자를 지원
 * - 개행은 기본적으로 지원하지 않음. 
 */
public class PrintfStudy {

	public static void main(String[] args) {
		PrintfStudy study = new PrintfStudy();
		study.test1();
	}
	
	public void test1() {
		boolean bool = true;
		char ch = '헐';
		int inum = 123;
		double dnum = 45.678;
		String str = "안녕하세요";
		
		// boolean %b
		System.out.printf("bool = %b, %b, %s\n", bool, !bool, inum > 100);
		System.out.println(123);
		
		// char %c
		// String %s
		System.out.printf("%c, %c, %s\n", ch, ch, ch);
		System.out.println(ch + ", " + ch + ", " + ch);
		System.out.printf("%s, 반갑습니다.\n", str);
		
		// 모든 정수타입 %d
		System.out.printf("inum = %d, %s\n", inum, inum);
		
		// 모든 실수타입 %f - 소수점이하6자리표시(기본값)
		// %.2f - 소수점이하 둘째자리까지(반올림)
		System.out.printf("dnum = %f, %.2f, %s\n", dnum, dnum, dnum);
		
		// 너비지정 및 정렬
		// %[flag][width]형식문자
		// flag가 -인 경우 좌측정렬
		System.out.printf("%10d|%-10d|\n", inum, inum);
		
		// 표작성
		System.out.println();
		System.out.printf("%10s%20s\n", "name", "phone");
		System.out.println("---------------------------------------------");
		System.out.printf("%10s%20s\n", "James", "01012341234");
		System.out.printf("%10s%20s\n", "Tomson", "01033334444");
		
		// 라인복사
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}
}










