package sh.java.type;

public class StringStudy {

	public static void main(String[] args) {
		StringStudy study = new StringStudy();
		study.test1();
	}
	
	/**
	 * 문자열
	 * java.lang.String 
	 * - 연속된 문자값을 관리
	 * - 쌍따옴표로 감싸야 한다.
	 * - "" 빈문자열도 가능. (char는 '' 빈문자 허용하지 않음)
	 * 
	 */
	public void test1() {
		String str1 = new String("기차");
		String str2 = "기차"; // 리터럴로 문자열 객체 생성 가능.
		
		// 더하기 연산 - 연결처리
		String str3 = str1 + str2;
		System.out.println(str3);
		
		// 다른 어떤 타입과 더해도 결과는 String이다.
		String str4 = str1 + 12345;
		String str5 = str1 + 12.345;
		String str6 = str1 + 'a';
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		// 문자열 비교
		// == 동등비교연산자가 아닌 equals메소드를 사용해야 한다.
		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true
	}
}









