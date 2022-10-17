package contents.game;

import java.time.LocalDate;
import java.util.Scanner;

import contents.resources.character.Bear;
import contents.resources.character.FemaleBear;
import contents.resources.character.MaleBear;

public class MakeCharacter {
    Scanner sc = new Scanner(System.in);

    public Bear selectCharacter() {

        Bear returnValue = null;

        System.out.println("꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°");
        System.out.println("    🐻 Welcome To My Happy Bear Game 🐻");
        System.out.println("꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°⌖꙳✧˖°");
        System.out.println("");

        System.out.println("곰돌이의 성별을 선택하세요🚹&🚺");
        System.out.println("");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("1.여자곰 🎀");
        System.out.println("2.남자곰 🎩");
        String ch = sc.nextLine();

        switch (ch) {
            case "1":
                returnValue = new FemaleBear();
                System.out.print("예쁜 곰돌이의 이름을 지어주세요 : ");
                returnValue.setBearName(sc.next());
                returnValue.setBirthday(LocalDate.now());
                break;
            case "2":
                returnValue = new MaleBear();
                System.out.print("멋진 곰돌이의 이름을 지어주세요 : ");
                returnValue.setBearName(sc.next());
                returnValue.setBirthday(LocalDate.now());
                break;
        }
        return returnValue;

    }
}
