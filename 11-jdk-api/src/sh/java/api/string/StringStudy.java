package sh.java.api.string;

import java.util.StringTokenizer;

/**
 * API
 * - Application Programming Interface
 *
 * String
 * - 불변 (immutable)
 * - heap 영역에 문자열 literal pool 을 통해 관리
 * - + / cancat 연산시, 기존 문자열을 변경하지 않고, 새로운 문자열을 만들어서 관리.
 * 
 * StringBuilder/StringBuffer
 * - 변경가능 (mutable)
 * - StringBuffer 멀티쓰레드 환경에서 안전하게 사용가능 (thread safe)
 */

public class StringStudy {

	public static void main(String[] args) {
		StringStudy study = new StringStudy();
		// study.test1();
		// study.test2();
		// study.test3();
		study.test4();

	}

	/**
	 * csv (comma separated value)
	 * - 사과,토마토,딸기,귤
	 * 
	 * String#split(구분자:String)
	 * - 공백도 하나의 값으로 인정함
	 * StringTokenizer(csv:String, 구분자:String)
	 * - 공백을 값으로 인정하지 않고 버림
	 */

	public void test4() {
		String value = "java,oracle,jdbc,html,css,javascript";

		// String#split
		String[] values = value.split(",");
		for (String val : values) {
			System.out.println(val);
		}
		System.out.println();

		// StringTokenizer
		StringTokenizer tokenizer = new StringTokenizer(value, ",");
		System.out.println(tokenizer.countTokens()); // 토큰 6개

		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
		System.out.println(tokenizer.countTokens()); // 토큰 0개 (토큰을 소비하는 방식임)

	}

	/**
	 * String api
	 */
	public void test3() {
		String str = "abcdefu";
		System.out.println(str.length());
		System.out.println(str.indexOf("cde")); // 2
		System.out.println(str.indexOf("xyz")); // -1
		System.out.println(str.contains("cde")); // true
		System.out.println(str.contains("xyz")); // false
		System.out.println(str.startsWith("ab")); // true
		System.out.println(str.endsWith("xy")); // false

		System.out.println(str.substring(2, 5)); // beginIndex는 포함, endIndex는 미포함
		System.out.println(str.substring(2)); // beginIndex부터 끝까지~

		System.out.println(str.replace("abc", "xyz")); // targer을 replacement로 바꿔서 반환 (immutable - 원본 문자열 변경 없음!)

	}

	/**
	 * StringBuilder/StringBuffer 사용방법이 동일하다.
	 * - StringBuffer가 동기화처리(thread-safe)를 지원하는 것만 다르다.
	 */
	public void test2() {
		StringBuffer sb = new StringBuffer("java");

		System.out.println(sb); // java
		System.out.println(sb.hashCode());

		sb.append("abc");

		System.out.println(sb); // javaabc
		System.out.println(sb.hashCode());

	}

	public void test1() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s3 == s4); // false

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // true

		// 문자열 변경
		s2 += "abc"; // "javaabc" 새로 생성
		s4 += "abc"; // 기존 생성된 javaabc 공유

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

	}

}
