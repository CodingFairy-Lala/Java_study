package contents.resources.action;

import java.util.Random;
import java.util.Scanner;

import contents.resources.character.Bear;

public class Action {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public void ill(Bear bear) {
        boolean flag = true;
        while (flag) {
            System.out.println("============================");
            System.out.println(bear.getFace() + bear.getBody());
            System.out.println("============================");
            System.out.println(bear.bearName + "이 아파요.. 약을 사주시겠습니까?");
            System.out.println("(1. 약 💊 사주기) (2. 무시하기)");
            System.out.print("\n선택 : ");
            String choice = sc.next();
            System.out.println("\r\r");
            int totalPoint = 3000; // 임시 부여함 나중에 수정하기
            switch (choice) {
                case "2":
                    System.out.println("============================\n" + " 무시하기 를 선택하셨습니다.\n" + bear.bearName
                            + "이 아파서 울고 있습니다..\n" + "행복 -30, 허기 -30, 청결 -30" + "============================\n");
                    bear.happiness -= 30;
                    bear.satiety -= 30;
                    bear.cleanliness -= 30;
                    break;
                case "1":
                    System.out.println("============================\n" + " 약 💊 사주기 를 선택하셨습니다.\n" + "가격은 [" + 2000
                            + "] 포인트 입니다.\n" + "============================\n");
                    if (totalPoint < 2000) {
                        System.out.println("식사 실패!! \n" + "포인트가 부족합니다. 잔여 포인트 : " + totalPoint);
                        break;
                    }
                    if (totalPoint >= 2000) {
                        totalPoint -= 2000;
                        System.out.println("============================");
                        System.out.print(bear.getFace() + bear.getBody());
                        System.out.println(
                                " 💊 맛없어요.. 그래도 냠냠! \n============================\n건강 + 90 \n" + "잔여 포인트 : "
                                        + totalPoint);
                        bear.health += 90;
                        break;
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
            }

        }
    }
}