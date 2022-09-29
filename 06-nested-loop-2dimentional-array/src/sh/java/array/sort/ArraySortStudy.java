package sh.java.array.sort;

import java.util.Arrays;

/**
 * 배열 정렬 알고리즘
 * - 순차 정렬
 * - 선택 정렬
 * - 버블 정렬
 * - 삽입 정렬
 * - 퀵 정렬
 * - 합병 정렬
 *   ...
 */

public class ArraySortStudy {

	public static void main(String[] args) {
		ArraySortStudy study = new ArraySortStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * 로또 생성기
	 * - 1~45 중에 6개 중복없는 난수, 오름차순 
	 */
	
	public void test4() {
		int[] lotto = new int[6];
		
		int cnt = 0;
		int index = 0; // 배열 index 관리 변수
		label:
		for(;;) { // 무한으로 돌려둠 (중복이 몇번 나올지 미지수니까)
			cnt++;
			int n = (int)(Math.random() *45 + 1);
			
			// 중복 제거
			for(int i = 0; i < index; i++) {
				if(lotto[i] == n)
					continue label;
			}
			
			lotto[index++] = n;
			if(index == lotto.length)
				break;
		}
		System.out.println(cnt);
			
		System.out.println(Arrays.toString(lotto));
	}

	
	/**
	 * 선택 정렬
	 * - 매 회차에 최소값을 찾고, 마지막에 해당하는 자리에 값 교환.
	 * - 순차 정렬 대비 값 교환 횟수가 적어 성능이 좋다.
	 */
	
	public void test3() {
		int[] arr = {4, 3, 0, 2, 1};
		// i = 0, 1, 2, 3
		for(int i = 0; i < arr.length-1; i++) {
			// 최소값에 해당하는 인덱스를 미리 지정
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
				print(arr, i, j, min);
			}
			swap(arr, i, min); // 회차마다 딱 한 번의 값 교환이 일어난다.
		}
		
		System.out.println("최종 결과 : " + Arrays.toString(arr));
	}
	
	// 정렬 과정 출력 메소드 + min 추가  -> overloading
	public void print(int[] arr, int i, int j, int min) {
		System.out.printf("%d %d : %s (%d)\n", i, j, Arrays.toString(arr), min);
	}
		
	/**
	 * 순차 정렬
	 * - 회차에 해당하는 index에 알맞은 수를 찾음.
	 * -  비교 횟수, 교환 횟수가 많음.
	 */
	
	public void test2() {
		int[] arr = {4, 3, 0, 2, 1};
		
		// i = 0, 1, 2, 3
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) 
					swap(arr, i, j);
				
				print(arr, i, j);
			}
		}
	}
	
	// 정렬 과정 출력 메소드
	public void print(int[] arr, int i, int j) {
		System.out.printf("%d %d : %s\n", i, j, Arrays.toString(arr));
	}

	// 값 교환 메소드
	public void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	
	/**
	 * 값 교환
	 */
	public void test1() {
		int m = 20;
		int n = 30;
		
		// 값 교환
		int tmp = m;
		m = n;
		n = tmp;
		System.out.printf("m = %d, n = %d\n", m, n);

		
		int[] arr = {2, 1, 3};
		// 0번지, 1번지 값 교환
//		tmp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = tmp;
		swap(arr, 0, 1);  // 값 변경 메소드 사용
		
		// 배열 값 확인 메소드 : Arrays.toString()
		System.out.println(Arrays.toString(arr));
	}


}
