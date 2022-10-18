package contents.game;

import java.util.Scanner;

import contents.bank.BearMoney;
import contents.resources.action.Action;
import contents.resources.character.Bear;

public class PlayGame {
    private static Bear character;
    private boolean flag = true;
    Scanner sc = new Scanner(System.in);

    public void play(Bear selectCharacter) {
        character = selectCharacter;
        while (flag) {
            if (character.getHealth() <= 0) {
                Action.ill(character);
            }
            if (character.getSatiety() <= 0 && character.getHappiness() <= 0 && character.getHealth() <= 0
                    && character.getCleanliness() <= 0) {
                character.printBear();
                System.out.println("\t** Game over **");
                System.out.println("** " + character.getBearName() + "곰은 행복을 찾아 곰나라로 떠나버렸어요.. **");
                StartGame.deleteBear(character);
                endGame();
                break;
            }

            character.printBear();
            System.out.println("1.밥먹이기 2.운동하기 3.목욕하기 4.잠자기 5.정보확인 6.포인트샵 7.게임종료");
            System.out.print("입력 >> ");
            String select = sc.next();
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
                    System.out.print("포인트샵으로 이동할까요? (y/n) : ");
                    char yn = sc.next().charAt(0);
                    if (yn == 'n') {
                        break;
                    }
                    if (yn == 'y') {
                        BearMoney.chargeMoney(character);
                        break;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }
                case "7":
                    System.out.print("정말 종료하시겠습니까? (y/n) : ");
                    char answer = sc.next().charAt(0);
                    if (answer == 'n') {
                        break;
                    }
                    if (answer == 'y') {
                        endGame();
                        break;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }

        }
    }

    public boolean endGame() {
        System.out.println();
        System.out.println("꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°");
        System.out.println("🐻 My Happy Bear Game 을 종료합니다 🐻");
        System.out.println("꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°");
        System.out.println();
        return flag = false;
    }

}
