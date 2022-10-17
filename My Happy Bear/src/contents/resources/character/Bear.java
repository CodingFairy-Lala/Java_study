package contents.resources.character;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Bear {
    Scanner sc = new Scanner(System.in);
    public String face = " ʕ•ᴥ•ʔ \n";
    public String exercisingFace = " ʕ›ᴥ‹ʔ \n";
    public String sleepingFace = " ʕᵕᴥᵕʔ zZ \n";
    public String showerFace = "   🚿 \n" + " ʕᵔᴥᵔʔ \n";
    public String body = "/|   |\\\n" + " O———O";
    public String exercisingBody = "\\|   |/🏀 \n" + " O———O";
    public String showerBody = "/|   |\\\n" + " O———O🧼";
    public int happiness = 50;
    public int satiety = 50;
    public int health = 70;
    public int cleanliness = 70;
    public char gender;
    public String bearName;
    public LocalDate birthday;
    String o = "□", x = "■"; // 상태 수치를 문자로 표시.

    public Bear() {
    }

    public Bear(String bearName, LocalDate birthday) {
        this.bearName = bearName;
        this.birthday = birthday;
    }

    public String getFace() {
        return this.face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getExercisingFace() {
        return this.exercisingFace;
    }

    public void setExercisingFace(String exercisingFace) {
        this.exercisingFace = exercisingFace;
    }

    public String getSleepingFace() {
        return this.sleepingFace;
    }

    public void setSleepingFace(String sleepingFace) {
        this.sleepingFace = sleepingFace;
    }

    public String getShowerFace() {
        return this.showerFace;
    }

    public void setShowerFace(String showerFace) {
        this.showerFace = showerFace;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getExercisingBody() {
        return this.exercisingBody;
    }

    public void setExercisingBody(String exercisingBody) {
        this.exercisingBody = exercisingBody;
    }

    public String getShowerBody() {
        return this.showerBody;
    }

    public void setShowerBody(String showerBody) {
        this.showerBody = showerBody;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getSatiety() {
        return this.satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCleanliness() {
        return this.cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getBearName() {
        return this.bearName;
    }

    public void setBearName(String bearName) {
        this.bearName = bearName;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void printInfo() { // 현재 상태를 수치로표현.
        System.out.println("============================");
        System.out.println("곰돌이 이름 : " + getBearName());
        // System.out.println("집사 이름 : " + );
        System.out.println("성별 : " + getGender());
        System.out.println("생일 : " + getBirthday());
        System.out.print("행복 : ");
        for (int i = 1; i <= 10; i++) { // 반복문을 '10' 번 수행.(특수문자 10개)
            if (this.happiness / 10 >= i) {
                System.out.print(x);
            } else
                System.out.print(o);
        }
        System.out.println();
        System.out.print("허기 : ");
        for (int i = 1; i <= 10; i++) {
            if (this.satiety / 10 >= i) {
                System.out.print(x);
            } else
                System.out.print(o);
        }
        System.out.println();
        System.out.print("건강 : ");
        for (int i = 1; i <= 10; i++) {
            if (this.health / 10 >= i) {
                System.out.print(x);
            } else
                System.out.print(o);
        }
        System.out.println();
        System.out.print("청결 : ");
        for (int i = 1; i <= 10; i++) {
            if (this.cleanliness / 10 >= i) {
                System.out.print(x);
            } else
                System.out.print(o);
        }
        System.out.println();
        System.out.println("============================");

    }

    public void eat() {
        boolean flag = true;
        String foodMenu = "============================\n" +
                "음식을 선택해주세요 :\n" +
                "1. 🍗 : 포만감 +40, 행복도 +10 / 1000 포인트\n" +
                "2. 🥕 : 포만감 +20, 건강 +30 / 500 포인트\n" +
                "3. 🍭 : 포만감 +15, 건강 -20 / 300 포인트\n" +
                "선택 : ";
        int totalPoint = 10000; // 임시 부여함 나중에 수정하기

        while (flag) {
            if (getSatiety() >= 100) {
                System.out.println("** " + getBearName() + "는 배가 불러서 더는 못먹어요! **");
                flag = false;
                break;
            }
            System.out.print(foodMenu);
            String choice = sc.next();

            switch (choice) {
                case "1":
                    System.out.println(
                            "============================\n" + " 🍗 을 선택하셨습니다.\n" + "가격은 [" + 1000 + "] 포인트 입니다.");
                    if (totalPoint < 1000) {
                        System.out.println("식사 실패!! \n" + "포인트가 부족합니다. 잔여 포인트 : " + totalPoint);
                        break;
                    }
                    if (totalPoint >= 1000) {
                        totalPoint -= 1000;
                        System.out.println("============================");
                        System.out.print(getFace() + getBody());
                        System.out.println(" 🍗 냠냠! \n============================\n포만감 +50, 행복도 +10 \n" + "잔여 포인트 : "
                                + totalPoint);
                        satiety += 40;
                        happiness += 10;
                        break;
                    }
                    break;
                case "2":
                    System.out.println("============================\n" + " 🥕 을 선택하셨습니다.\n" + "가격은 [" + 500
                            + "] 포인트 입니다.\n" + "============================\n");
                    if (totalPoint < 500) {
                        System.out.println("식사 실패!! \n" + "포인트가 부족합니다. 잔여 포인트 : " + totalPoint);
                        break;
                    }
                    if (totalPoint >= 500) {
                        totalPoint -= 500;
                        System.out.println("============================");
                        System.out.print(getFace() + getBody());
                        System.out.println(
                                " 🥕 냠냠! \n============================\n포만감 +20, 건강 +30 \n" + "잔여 포인트 : "
                                        + totalPoint);
                        satiety += 20;
                        health += 30;
                        break;
                    }
                    break;
                case "3":
                    System.out.println("============================\n" + " 🍭 을 선택하셨습니다.\n" + "가격은 [" + 300
                            + "] 포인트 입니다.\n" + "============================\n");
                    if (totalPoint < 300) {
                        System.out.println("식사 실패!! \n" + "포인트가 부족합니다. 잔여 포인트 : " + totalPoint);
                        break;
                    }
                    if (totalPoint >= 300) {
                        totalPoint -= 300;
                        System.out.println("============================");
                        System.out.print(getFace() + getBody());
                        System.out.println(
                                " 🍭 냠냠! \n============================\n포만감 +15, 건강 -20 \n" + "잔여 포인트 : "
                                        + totalPoint);
                        satiety += 15;
                        health -= 20;
                        break;
                    }
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
            System.out.print("식사를 계속 하시겠습니까? (y/n) : ");
            char yn = sc.next().charAt(0);
            if (yn == 'n') {
                System.out.println("식사를 종료합니다...");
                flag = false;
                break;
            }
            if (getSatiety() >= 100) {
                System.out.println("** " + getBearName() + " 배가 불러서 더는 못먹어요! **");
                flag = false;
                break;
            }
        }
    }

    public void exercise() {
        boolean flag = true;
        while (flag) {
            System.out.println("운동을 시작할까요? (1. 운동 시작!! / 2. 운동 종료) : ");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    if (getSatiety() <= 0) {
                        System.out.println("** " + getBearName() + "는 배가 고파서 더는 운동 못해요! **");
                        flag = false;
                        break;
                    }
                    System.out.println("============================");
                    System.out.println(getExercisingFace() + getExercisingBody() + "  하나 둘! 셋 넷!");
                    System.out.println("============================");
                    System.out.println("건강 +40, 포만감 -30, 청결 -20");
                    health += 40;
                    satiety -= 30;
                    cleanliness -= 20;
                    break;
                case "2":
                    System.out.print("운동을 계속 하시겠습니까? (y/n) : ");
                    char yn = sc.next().charAt(0);
                    if (yn == 'n') {
                        System.out.println("운동을 종료합니다...");
                        flag = false;
                        break;
                    }
                    if (getSatiety() <= 0) {
                        System.out.println("** " + getBearName() + "는 배가 고파서 더는 운동 못해요! **");
                        flag = false;
                        break;
                    }
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }

    }

    public void shower() {
        System.out.println("목욕을 시작할까요? (1. 목욕 시작 / 2. 목욕 종료)");
        String choice = sc.next();
        switch (choice) {
            case "1":
                System.out.println("============================");
                System.out.println(getShowerFace() + getShowerBody() + " 시원하당~");
                System.out.println("============================");
                System.out.println("청결 +100, 행복 +10");
                cleanliness += 100;
                happiness += 10;
                break;
            case "2":
                System.out.print("목욕을 계속 하시겠습니까? (y/n) : ");
                char yn = sc.next().charAt(0);
                if (yn == 'n') {
                    System.out.println("목욕을 종료합니다...");
                    break;
                }
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void sleep() {
        boolean flag = true;
        while (flag) {
            System.out.println("낮잠을 잘까요? (1. 낮잠 자기 / 2. 낮잠 취소)");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    if (getSatiety() <= 0) {
                        System.out.println("** " + getBearName() + "는 배가 고파서 잠이 오지 않아요! **");
                        flag = false;
                        break;
                    }
                    System.out.println("============================");
                    System.out.println(getSleepingFace() + getBody() + " 쿨 ~ ");
                    System.out.println("============================");
                    System.out.println("행복 +20, 포만감 -30, 청결 -20");
                    happiness += 20;
                    satiety -= 30;
                    cleanliness -= 20;
                    break;
                case "2":
                    System.out.print("낮잠을 계속 자겠습니까? (y/n) : ");
                    char yn = sc.next().charAt(0);
                    if (yn == 'n') {
                        System.out.println("낮잠을 종료합니다...");
                        flag = false;
                        break;
                    }
                    if (getSatiety() <= 0) {
                        System.out.println("** " + getBearName() + "는 배가 고파서 잠이 오지 않아요! **");
                        flag = false;
                        break;
                    }
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public void clean() {

    }

    public void cure() {

    }

    public boolean endGame() {
        return false;
    }

}
