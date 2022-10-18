package contents.resources.character;

import java.util.Scanner;

public class FemaleBear extends Bear {
    Scanner sc = new Scanner(System.in);
    public char gender = 'F';
    public String face = "\t  🎀  \n" + "\t ʕ•ᴥ•ʔ \n";
    public String exercisingFace = "\t  🎀  \n" + "\t ʕ›ᴥ‹ʔ \n";
    public String sleepingFace = "\t  🎀  \n" + "\t ʕᵕᴥᵕʔ💤zZ \n";
    public String body = "\t/|   |\\\n" + "\t O———O";

    public FemaleBear() {
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
            this.face = "\t  🎀  \n" + "\t ʕ◞ᴥ◟ʔ 힝..\n";
        }
        if (getHappiness() >= 80) {
            this.face = "\t  🎀  \n" + "\t ʕ›ᴥ‹ʔ 해피💕 \n";
        }
        if (getCleanliness() <= 10) {
        	this.face = "\t  🎀  \n" + "\t ʕ◞ᴥ◟ʔ 💨 나 냄시나.. \n";
        }
        if (getSatiety() < 15) {
        	this.face = "\t  🎀  \n" + "\t ʕ-ᴥ-ʔ  꼬르륵.. \n";
        }
        if (getHealth() <= 0) {
            this.face = "\t  🎀  \n" + "\t ʕ×ᴥ×ʔ💧 많이 아파용.. \n";
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
