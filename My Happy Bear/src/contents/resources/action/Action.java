package contents.resources.action;

import java.util.Scanner;

import contents.bank.BearMoney;
import contents.resources.character.Bear;

public class Action {

    public static void ill(Bear bear) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            if (bear.getSatiety() <= 0 && bear.getHappiness() <= 0 && bear.getHealth() <= 0
                    && bear.getCleanliness() <= 0) {
                flag = false;
                break;
            }
            bear.printBear();
            System.out.println(bear.bearName + "곰이 아파요.. 약을 사주시겠습니까?");
            System.out.println("(1. 약 💊 사주기) (2. 무시하기) (3. 정보확인) (4.포인트 충전)");
            System.out.print("\n선택 : ");
            String choice = sc.next();
            System.out.println("");
            switch (choice) {
                case "4":
                    System.out.print("포인트샵으로 이동할까요? (y/n) : ");
                    char yn = sc.next().charAt(0);
                    if (yn == 'n') {
                        break;
                    }
                    if (yn == 'y') {
                        BearMoney.chargeMoney(bear);
                        break;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }
                case "3":
                    bear.printInfo();
                    break;
                case "2":
                    System.out.println("============================\n" + " 무시하기 를 선택하셨습니다.\n" + bear.bearName
                            + "곰이 아파서 울고 있습니다..\n" + "행복 -30, 허기 -30, 청결 -30\n" + "============================\n");
                    bear.happiness -= 30;
                    bear.satiety -= 30;
                    bear.cleanliness -= 30;
                    break;
                case "1":
                    System.out.println("============================\n" + " 약 💊 사주기 를 선택하셨습니다.\n" + "가격은 [" + 2000
                            + "] 포인트 입니다.\n" + "============================\n");
                    if (bear.getPoint() < 2000) {
                        System.out.println("약 구매 실패!! \n" + "포인트가 부족합니다. 잔여 포인트 : " + bear.getPoint());
                        break;
                    }
                    if (bear.getPoint() >= 2000) {
                        bear.setPoint(bear.getPoint() - 2000);
                        System.out.println("============================");
                        System.out.print(bear.getFace() + bear.getBody());
                        System.out.println(
                                " 💊 약 맛없어요.. 그래도 냠냠! \n============================\n건강 + 90 \n" + "잔여 포인트 : "
                                        + bear.getPoint());
                        bear.health += 90;
                        flag = false;
                        break;
                    }
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }

        }
    }

}