package com.sh.test.star;

public class Star {

	public static void main(String[] args) {
		Star study = new Star();
		study.test1();
		study.test2();
		study.test3();
		
		
	}
	
	/**
	 * @실습문제1
			
		*****
		****
		***
		**
		*
		
		@실습문제2
		
		*
		**
		***
		****
		*****
		
		@실습문제3
		
		    *
		   **
		  ***
		 **** 
		*****
		
		@실습문제4
		
		    *     
		   ***    
		  *****   
		 *******  
		********* 
	 */
	
	/**
	 	 @실습문제1
			
		*****
		****
		***
		**
		*
	 */
	
	public void test1() {
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j <= i-1; j++) {
				System.out.print("*");
			}
		System.out.println();
		
		}
	}
		
/**
 * 		@실습문제2
		
		*
		**
		***
		****
		*****
 */
	public void test2() {
		for(int i = 0 ; i <= 5; i++) {
			for(int j = 0; j <= i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
/**
 * 		@실습문제3
		
		    *
		   **
		  ***
		 **** 
		*****
 */
	public void test3() {
//		for(int i = 0; i <
		
		
	}
	
	
	
}
