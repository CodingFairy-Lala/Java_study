package com.sh.test.array.sort;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Test study = new Test();
		study.test();
	}
	
	/**
	 * 문제
	 * - 1 ~ 100사이의 난수 10개를 생성해 배열에 대입하고, 오름차순 정렬하세요.
	 */

	public void test() {
		Random rnd = new Random();
		int[] arr = new int[10];
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = rnd.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 순차 정렬
//		for(int i = 0; i < arr.length-1; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j])
//					swap(arr, i, j);
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		// 선택 정렬
		for(int i = 0; i < arr.length-1; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j])
					min = j;
			}
			swap(arr, i, min);
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	// swap 메소
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
