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
                        System.out.println("** " + character.getBearName() + "는 배가 불러서 더는 못먹어요! **");
                    }
                    break;
                case "2":
                    if (character.getSatiety() > 0) {
                        character.exercise();
                    } else {
                        System.out.println("** " + character.getBearName() + "는 배가 고파서 운동할 힘이 없어요! **");
                    }
                    break;
                case "3":
                    if (character.getCleanliness() < 100) {
                        character.shower();
                    } else {
                        System.out.println("** " + character.getBearName() + "는 깨끗해서 씻지 않아도 돼요! **");
                    }
                    break;
                case "4":
                    if (character.getSatiety() > 0) {
                        character.sleep();
                    } else {
                        System.out.println("** " + character.getBearName() + "는 배가 고파서 잠이 오지 않아요! **");
                    }
                    break;
                case "5":
                    character.printInfo();
                    break;
                case "6":
                    System.out.println("꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°");
                    System.out.println("    🐻 My Happy Bear Game 을 종료합니다 🐻");
                    System.out.println("꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°");
                    flag = false;
                    break;
                default:
                    break;
            }

        }
    }
}
