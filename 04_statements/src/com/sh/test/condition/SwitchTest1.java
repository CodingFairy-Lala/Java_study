package com.sh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {

		SwitchTest1 study = new SwitchTest1();
		study.test();
	}
	/**
	 * [문제11]    
@com.sh.test.condition.SwitchTest1
수도세를 구하는 프로그램을 작성하세요. 
사용자에게 사용용도와 물사용량을 입력받고, 이에따른 수도세를 계산해 출력하세요.(switch문 사용할 것.)
* 사용요금: 용도별 가격(1liter)  * 사용량
* 수도세: 사용요금의 5%
* 총사용요금: 사용요금 + 수도세
* 사용용도메뉴에서 1,2,3번이외를 선택시에는 "메뉴번호는 1,2,3만 가능합니다."를 출력하고, 프로그램을 종료할 수 합니다.


사용자입력예시)

        ----------menu----------
        1. 가정용 (50원/liter)
        2. 상업용 (45원/liter)
        3. 공업용 (30원/liter)
        -------------------------
        메뉴번호를 선택하세요. ==> 2
        물 사용량을 입력하세요. ==> 250


출력예시)

        ----------<<수도세>>-----------
        선택메뉴번호 :  2. 상업용(업소에서 사용하실 경우)를 선택하셨습니다. 
        사용요금 : 11250
        수도세 : 562
        총수도요금 : 11812원
	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		String menu = "----------menu----------\n"
				+ "1. 가정용 (50원/liter)\n"
				+ "2. 상업용 (45원/liter)\n"
				+ "3. 공업용 (30원/liter)\n"
				+ "-------------------------";
		System.out.println(menu);
		System.out.print("메뉴 번호를 입력하세요. ==> ");
		String num = sc.next();
		String typeName = "";
		int type = 0;
		switch(num) {
		case "1" : typeName = "1. 가정용"; type = 50; break;
		case "2" : typeName = "2. 상업용"; type = 45; break;
		case "3" : typeName = "3. 공업용"; type = 30; break;
		default : System.out.println("메뉴 번호는 1, 2, 3만 가능합니다."); return;
		}
		System.out.print("물 사용량을 입력하세요. ==> ");		
		int amount = sc.nextInt();
		int fee = amount * type;
		int waterFee = fee * 1/20;
		int totalFee = fee + waterFee;
		
		String result = "----------<<수도세>>-----------\n"
				+ "선택메뉴번호 :  "+typeName+"을 선택하셨습니다. \n"
				+ "사용요금 : "+fee+"원\n"
				+ "수도세 : "+waterFee+"원\n"
				+ "총수도요금 : "+totalFee+"원";
		System.out.println(result);
		
		
	}
}
