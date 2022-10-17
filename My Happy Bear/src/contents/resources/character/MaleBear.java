package contents.resources.character;

import java.util.Scanner;

public class MaleBear extends Bear {
    Scanner sc = new Scanner(System.in);
    public char gender = 'M';
    public String face = "  🎩  \n" + " ʕ•ᴥ•ʔ \n";
    public String exercisingFace = "  🎩  \n" + " ʕ›ᴥ‹ʔ \n";
    public String sleepingFace = "  🎩  \n" + " ʕᵕᴥᵕʔ zZ \n";
    public String body = "/|   |\\\n" + " O———O";

    public MaleBear() {
        super();
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        if (getHappiness() <= 20) {
            this.face = "  🎩  \n" + " ʕ◞ᴥ◟ʔ \n";
        }
        if (getHappiness() >= 80) {
            this.face = "  🎩  \n" + " ʕ›·̫‹ʔ 💕 \n";
        }
        if (getSatiety() <= 10) {
            this.face = "  🎩  \n" + " ʕ-ᴥ-ʔ  꼬르륵..\n";
        }
        if (getHealth() <= 0) {
            this.face = "  🎩  \n" + " ʕ×ᴥ×ʔ \n";
        }
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

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
