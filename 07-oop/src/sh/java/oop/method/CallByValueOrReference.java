package sh.java.oop.method;

import java.util.Arrays;

/**
 * Call by value
 *	-기본형인 경우
 *	-값 복사
 *
 *
 *
 * Call by refernce
 *	-참조형인 경우
 *	-주소값 복사 (얕은 복사같은 현상이 일어남)
 *
 *
 */


public class CallByValueOrReference {

	public static void main(String[] args) {
		CallByValueOrReference instance = new CallByValueOrReference();

			// call by value
			int a = 10;
			instance.call(a);
			System.out.println(a); // 10 (아무 효과도 일어나지 않음)
			
			// call by reference
			int[] arr = {1, 2, 3};
			instance.call(arr);
			System.out.println(Arrays.toString(arr)); // [1, 20, 3] (얕은 복사처럼 heap공간에 객체를 공유함)
			
			instance.call(a, arr);
	}
	
	public void call (int n, int [] arr) {
		n += 10;
		arr[1] *= 10;
	}
	public void call (int [] arr) {
		arr[1] *= 10;
	}
	public void call (int n) {
		n += 10;
	}
	
	
}
