package sh.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 제네릭
 * - 클래스레벨 : 변수타입이나 객체생성시 작성해서 객체요소의 타입제한
 * 
 * - 메소드레벨 : 파라미터/리턴타입에 타입제한
 * 
 */
public class GenericsStudy {

	public static void main(String[] args) {
		GenericsStudy study = new GenericsStudy();
		// study.test1();
		study.test2();
	}

	/**
	 * 메소드레벨
	 */
	private void test2() {
		int sum = run(10);
		String str = run("abc");

		System.out.println(sum);
		System.out.println(str);

		List<Integer> intList = of(1, 2, 3, 4);
		System.out.println(intList);

		List<String> strList = of("안녕", "잘가");
		System.out.println(strList);

		// Arrays.asList, List.of : 변경 불가한 list를 반환
		List<String> strList2 = List.of("안녕", "잘가");
		strList2.add("ㅋㅋㅋ"); // java.lang.UnsupportedOperationException 변경불가
	}

	private <E> List<E> of(E... elems) {
		List<E> list = new ArrayList<>();
		for (E e : elems)
			list.add(e);
		return list;

		// return Arrays.asList(elems);
	}

	/**
	 * 매개변구 T타입의 값을 반환한다.
	 * 
	 * @param <T>
	 * @param t
	 * @return
	 */
	public <T> T run(T t) {
		return t;
	}

	/**
	 * 클래스레벨
	 */
	private void test1() {
		Box<String> strBox = new Box<>();
		strBox.add("hello");
		strBox.add("world");

		System.out.println(strBox.get(0));
		System.out.println(strBox.get(1));

		for (int i = 0; i < strBox.size(); i++) {
			System.out.println(strBox.get(i));
		}

		System.out.println(strBox.indexOf("hello"));
		System.out.println(strBox.indexOf("world"));
		System.out.println(strBox.indexOf("ㅋㅋㅋㅋ"));

	}

}
