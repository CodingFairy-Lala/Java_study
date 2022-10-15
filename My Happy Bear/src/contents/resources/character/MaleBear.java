package contents.resources.character;

import java.util.Scanner;

public class MaleBear implements Bear {
    Scanner sc = new Scanner(System.in);

    @Override
    public void eat() {
        String foodMenu = "음식을 선택해주세요 :\n" +
                "1. 🍗 : 포만감 +50, 행복도 +10 / 1000 포인트\n" +
                "2. 🥕 : 포만감 +20, 건강 +30 / 500 포인트\n" +
                "3. 🍭 : 포만감 +15, 건강 -20 / 300 포인트\n" +
                "선택 : ";
        int totalPoint = 10000; // 임시 부여함 나중에 수정하기

        for (;;) {
            System.out.print(foodMenu);
            String choice = sc.next();

            switch (choice) {
                case "1":
                    System.out.println(" 🍗 을 선택하셨습니다.\n" + "가격은 [" + 1000 + "] 포인트 입니다.");
                    if (totalPoint < 1000) {
                        System.out.println("식사 실패!! \n" + "포인트가 부족합니다. 잔여 포인트 : " + totalPoint);
                        break;
                    }
                    if (totalPoint >= 1000) {
                        totalPoint -= 1000;
                        System.out.println("🍗 냠냠! \n+20, 건강 +30 \n" + "잔여 포인트 : " + totalPoint);
                    }
                    break;
                case "2":
                    System.out.println(" 🥕 을 선택하셨습니다.\n" + "가격은 [" + 500 + "] 포인트 입니다.");
                    System.out.println(" 🥕 을 선택하셨습니다.\n" + "가격은 [" + 500 + "] 포인트 입니다.");
                    if (totalPoint < 500) {
                        System.out.println("식사 실패!! \n" + "포인트가 부족합니다. 잔여 포인트 : " + totalPoint);
                        break;
                    }
                    if (totalPoint >= 500) {
                        totalPoint -= 500;
                        System.out.println("🥕 냠냠! \n포만감 +50, 행복도 +10 \n" + "잔여 포인트 : " + totalPoint);
                        break;
                    }
                case "3":
                    System.out.println(" 🍭 을 선택하셨습니다.\n" + "가격은 [" + 300 + "] 포인트 입니다.");
                    System.out.println(" 🍭 을 선택하셨습니다.\n" + "가격은 [" + 300 + "] 포인트 입니다.");
                    if (totalPoint < 300) {
                        System.out.println("식사 실패!! \n" + "포인트가 부족합니다. 잔여 포인트 : " + totalPoint);
                        break;
                    }
                    if (totalPoint >= 300) {
                        totalPoint -= 300;
                        System.out.println("🍭 냠냠! \n포만감 +15, 건강 -20 \n" + "잔여 포인트 : " + totalPoint);
                        break;
                    }
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
            System.out.print("식사를 계속 하시겠습니까?(y/n) : ");
            char yn = sc.next().charAt(0);
            if (yn == 'n') {
                break;
            }
        }
        System.out.println("식사를 종료합니다...");
    }

    @Override
    public void exercise() {
        // TODO Auto-generated method stub

    }

    @Override
    public void shower() {
        // TODO Auto-generated method stub

    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub

    }

    @Override
    public void clean() {
        // TODO Auto-generated method stub

    }

    @Override
    public void cure() {
        // TODO Auto-generated method stub

    }

    @Override
    public void printInfo() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean endGame() {
        // TODO Auto-generated method stub
        return false;
    }

}
