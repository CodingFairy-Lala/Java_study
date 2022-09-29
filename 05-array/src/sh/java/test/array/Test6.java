package sh.java.test.array;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Test6 study = new Test6();
		study.test();
	}

	/**
	 * [문제6]
- 클래스 : sh.java.test.array.Test6.java
- 메소드명 : public void test()
    배열의 크기로 홀수인 양의 정수를 입력 받아 배열을 만드세요. 
    배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 
    중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하는 프로그램을 작성하세요.

    출력예시)

    홀수인 양의정수를 하나 입력하세요 ==> 7
    [1, 2, 3, 4, 3, 2, 1]
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수를 하나 입력하세요. ==> ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 1;
		int sub = 1;
		for(int i = 0; i < arr.length; i++) {
			if (i > (size/2))
				break;
			arr[i] = sum;
			sum += 1;
			arr[arr.length-1-i] = sub;
			sub += 1;
		}
		for(int check : arr)
			System.out.print(check +" ");
		
		System.out.println();
		
		//확인용
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i != arr.length -1 ? ", " : "");
		}
		System.out.print("]");
	}
}
