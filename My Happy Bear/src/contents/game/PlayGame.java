package contents.game;

import java.util.Scanner;

import contents.resources.character.Bear;

public class PlayGame {
    private static Bear character;
    private boolean flag = true;
    Scanner sc = new Scanner(System.in);

    public void play(Bear selectCharacter) {
        character = selectCharacter;
        while (flag) {
            if (character.getSatiety() <= 0 && character.getHappiness() <= 0 && character.getHealth() <= 0
                    && character.getCleanliness() <= 0) {
                System.out.println("============================");
                System.out.println(character.getFace() + character.getBody());
                System.out.println("============================");
                System.out.println(character.getBearName() + "곰은 별나라로 떠나버렸어요..");
                System.out.println("** Game over **");
                endGame();
            }
            if (character.getHealth() <= 0) {
                ill(character);
            }

            System.out.println("============================");
            System.out.println(character.getFace() + character.getBody());
            System.out.println("============================");
            System.out.println("1.밥먹이기 2.운동하기 3.목욕하기 4.잠자기 5.정보확인 6.종료");
            System.out.print("입력 >> ");
            String select = sc.nextLine();
            switch (select) {
                case "1":
                    if (character.getSatiety() < 100) {
                        character.eat();
                    } else {
                        System.out.println("** " + character.getBearName() + "곰은 배가 불러서 더는 못먹어요! **");
                    }
                    break;
                case "2":
                    if (character.getSatiety() > 0) {
                        character.exercise();
                    } else {
                        System.out.println("** " + character.getBearName() + "곰은 배가 고파서 운동할 힘이 없어요! **");
                    }
                    break;
                case "3":
                    if (character.getCleanliness() < 100) {
                        character.shower();
                    } else {
                        System.out.println("** " + character.getBearName() + "곰은 깨끗해서 씻지 않아도 돼요! **");
                    }
                    break;
                case "4":
                    if (character.getSatiety() > 0) {
                        character.sleep();
                    } else {
                        System.out.println("** " + character.getBearName() + "곰은 배가 고파서 잠이 오지 않아요! **");
                    }
                    break;
                case "5":
                    character.printInfo();
                    break;
                case "6":
                    endGame();
                    break;
                default:
                    break;
            }

        }
    }

    public void endGame() {
        System.out.println("꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°");
        System.out.println("    🐻 My Happy Bear Game 을 종료합니다 🐻");
        System.out.println("꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°");
        flag = false;
    }

    public void ill(Bear bear) {
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
                    System.out.println("구매 실패!! \n" + "포인트가 부족합니다. 잔여 포인트 : " + totalPoint);
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
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }

    }
}
