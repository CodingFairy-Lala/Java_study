package net.kh.product.model;

public class NcsTest3_2 {

	public static void main(String[] args) {
		int[][] arr = new int[5][3];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
			}
		
		
	}
}
