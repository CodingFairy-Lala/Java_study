package net.kh.product.model;

public class NcsTest3_1 {
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		int num = 1;
		for (int i = 0; i < 10; i++) {
			arr[i] = num++;
			if (i == 9) {
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i] + ", ");
		}
	}
}
