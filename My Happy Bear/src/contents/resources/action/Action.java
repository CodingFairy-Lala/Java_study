package contents.resources.action;

import java.util.Random;
import java.util.Scanner;

import contents.resources.character.Bear;

public class Action {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public void action(Bear bear) {
        while (true) {
            System.out.println("============================");
            System.out.println(bear.getFace() + bear.getBody());
            System.out.println("============================");
            System.out.println("\r\n무엇을 하시겠습니까?");
            System.out.print("(1. 밥먹기) (2. 운동하기) (3. 씻기) (4. 낮잠) (5. 나가기)");
            System.out.print("\n선택 : ");
            int num = sc.nextInt(); // 숫자 입력
            System.out.println("\r\r");
            switch (num) {
                case 5:
                    break;
                case 4:
                    bear.sleep();
                    break;
                case 3:
                    bear.shower();
                    break;
                case 2:
                    bear.exercise();
                    break;
                case 1:
                    if (bear.getSatiety() < 100) {
                        bear.eat();
                    } else {
                        System.out.println("곰돌이는 배가 불러서 더는 못먹어요!");
                    }
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
            }

        }
    }
}