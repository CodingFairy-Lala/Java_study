package sh.java.bear.bank;

import java.util.Scanner;

public class BearMoney {
	
	  public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  Scanner in = new Scanner(System.in);
		  
		  System.out.println("❉ ╤╤╤╤╤╤╤╤╤╤╤ ✿ ╤╤╤╤╤╤╤╤╤╤╤ ❉");
		  System.out.println("");
		  System.out.println("   🐻Happy Bear Point Shop🐻");  
		    System.out.println("");  
		    System.out.println("❉ ╧╧╧╧╧╧╧╧╧╧╧ ✿ ╧╧╧╧╧╧╧╧╧╧╧ ❉");
		    System.out.println("");
		  
		  System.out.println("곰돌포인트를 얼마나 충전하시겠습니까?");
		  int tmpMoney = sc.nextInt();
		  
		  int pointMoney = 0;
		  
		  pointMoney = (int)(tmpMoney * 1.1);
		  
		  System.out.println("10%포인트 적립되어서 " + pointMoney + " (원) 충전되었습니다.");
		  System.out.println(" ʕ ̳• · • ̳ʔ");
		  System.out.println(" / づ♡ =͟͟͞͞♡");
		  System.out.println("");
		  String str = in.nextLine(); 
		  
		  System.out.println("포인트를 쓰러 게임으로 이동하시겠습니까?🎀");
		  System.out.println("");
		  System.out.println("1.이동 2. 종료 ");
		  int tmpInt = sc.nextInt();
		  
		  if(tmpInt == 1) {
			  //게임실행 메소드호출
			  
		  }
		  
		  else {
			  //종료 메소드호출
		  }
	  }
	
}

