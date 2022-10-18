package contents.bank;

import java.util.Scanner;

import contents.resources.character.Bear;

public class BearMoney {

	public static void chargeMoney(Bear bear) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		System.out.println("❉ ╤╤╤╤╤╤╤╤╤╤╤ ✿ ╤╤╤╤╤╤╤╤╤╤╤ ❉");
		System.out.println("");
		System.out.println("   🐻Happy Bear Point Shop🐻");
		System.out.println("");
		System.out.println("❉ ╧╧╧╧╧╧╧╧╧╧╧ ✿ ╧╧╧╧╧╧╧╧╧╧╧ ❉");
		System.out.println("");

		while (flag) {
			System.out.println("곰돌포인트를 얼마나 충전하시겠습니까?");
			int chargeMoney = sc.nextInt();
			int pointMoney = 0;
			pointMoney = (int) (chargeMoney * 1.1);

			bear.setPoint(bear.getPoint() + pointMoney);

			System.out.println("10% 포인트 추가적립 되어 총 " + pointMoney + "포인트 충전되었습니다.");
			System.out.println(" ʕ ̳• · • ̳ʔ");
			System.out.println(" / づ♡ =͟͟͞͞♡");
			System.out.println("나의 포인트 : " + bear.getPoint());

			System.out.println("게임으로 이동하시겠습니까?🎀 (y/n) ");
			System.out.print("선택 : ");
			char yn = sc.next().charAt(0);
			if (yn == 'n') {
				continue;
			}
			if (yn == 'y') {
				flag = false;
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}

	}
}