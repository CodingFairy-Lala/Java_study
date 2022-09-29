package sh.java.array;

import java.util.Arrays;

public class ArrayCopyStudy {


	public static void main(String[] args) {
		ArrayCopyStudy study = new ArrayCopyStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * System.arraycopy
	 * - 배열 일부 복사 가능
	 * - 두 배열 합치기 작업에 유용하다.
	 */
	
	public void test4() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int [5];
		System.arraycopy(arr, 5, arr2, 0, 5);
		
		for(int i : arr2) {
			System.out.println(i);
		}
		
		
		
		int[] a = {1,2,3};
		int[] b = {4,5,6,7};
		int[] c = new int[7];
		
		int start = 0;
		System.arraycopy(a, start, c, start, a.length);
		start += a.length;
		System.arraycopy(b, 0, c, start, b.length);
		
		for(int i = 0; i < c.length; i++)
				System.out.printf("c[%d] = %d\n", i, c[i]);
	}
	
	
	/**
	 * 배열 복사
	 * 얕은 복사 shallow copy
	 * - heap 영역의 배열객체에 대한 주소값 복사
	 * - 같은 배열객체를 공유
	 * 깊은 복사 deep copy
	 * - heap 영역에 동일한 크기/값을 가진 배열객체 복사
	 * - 참조변수별로 다른 배열을 참조.
	 */
	
	/**
	 *  - System.arraycopy():void
	 *  - Arrays.copy():T[]
	 *  - clone()
	 */
	
	public void test3() {
		int[] arr1 = {1, 2, 3};

		//System.arraycopy(arc, start, dest, start, length) :void
		int[] arr2 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		arrayEquals(arr1, arr2);

		// Arrays.copyOf
		int[] arr3 = Arrays.copyOf(arr1, arr1.length);
		arrayEquals(arr1, arr3);
		
		//clone
		int[] arr4 = arr1.clone();
		arrayEquals(arr1, arr4);
		
	}
	
	
	public void arrayEquals(int[] arr1, int[] arr2) {
		System.out.printf("주소값 일치 여부 : %b\n", arr1 == arr2);
		System.out.printf("배열 내용 일치 여부 : %b\n", Arrays.equals(arr1, arr2));
	}
	
	
	/**
	 * 깊은 복사
	 * 1. 반복문을 통한 직접 복사
	 * 2. System.arraycopy
	 * 3. Arrays.copy
	 * 4. clone
	 */
	
	public void test2() {
		char[] arr1 = {'가', '나', '다'};
		char[] arr2 = new char[arr1.length];
		// 1. 반복문을 통한 직접 복사
		for(int i = 0; i < arr1.length; i++)
			arr2[i] = arr1[i]; // 좌항의 공간에 우항의 값을 대입
		
		System.out.println(arr1 == arr2); // false 주소값 다름
		System.out.println(Arrays.equals(arr1, arr2)); // true 배열 내용 비교
		
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		
		arr1[1] = '켘';
		
		for(int i = 0; i <arr1.length; i++)
			System.out.printf("%d - %c, %c\n", i, arr1[i], arr2[i]);
	}
	
	/**
	 * 얕은 복사
	 */
	public void test1() {
		char[] arr1 = {'a', 'b', 'c'};
		char[] arr2 = arr1; // 참조 주소값을 복사 (하나의 객체를 두 변수가 참조함)
			
		System.out.println(arr1 == arr2); // true 주소값 비교
		
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		
		arr1[1] = 'x';
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d - %c, %c\n", i, arr1[i], arr2[i]);
		}
	}

}
