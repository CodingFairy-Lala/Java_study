package contents.resources.appearance;

public class Face {
    public String face = " ʕ•ᴥ•ʔ \n";
    public String maleFace = "  🧢  \n" + " ʕ•ᴥ•ʔ \n";

    // System.out.println(" 🧢 \n" + " ʕ•ᴥ•ʔ \n" + "/| |\\\n" + " O———O");
    // System.out.println(" ʕᵔᴥᵔʔ \n" + "/| |\\\n" + " O———O");
    // System.out.println(" ʕ￫ᴥ￩ʔ \n" + "/| |\\\n" + " O———O");
    // System.out.println(" ʕ·̀ᴥ·́ʔ \n" + "/| |\\\n" + " O———O");
    // System.out.println(" ʕ-ᴥ-ʔ \n" + "/| |\\\n" + " O———O");
    // System.out.println(" ʕ◞ᴥ◟ʔ \n" + "/| |\\\n" + " O———O");
    // System.out.println(" ʕ×ᴥ×ʔ \n" + "/| |\\\n" + " O———O");
    // System.out.println(" ʕᵕᴥᵕʔ \n" + "/| |\\\n" + " O———O");
    // System.out.println(" ʕ›ᴥ‹ʔ \n" + "/| |\\\n" + " O———O");
    // System.out.println(" ʕ´̥ᴥ`̥ʔ \n" + "/| |\\\n" + " O———O");

    public Face() {
    }

    public String getFace() {
        return this.face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getMaleFace() {
        return this.maleFace;
    }

    public void setMaleFace(String maleFace) {
        this.maleFace = maleFace;
    }

    public String femaleFace() {
        return "  🎀  \n" + " ʕ•ᴥ•ʔ \n";
    }

    public String maleFace() {
        return "  🧢  \n" + " ʕ•ᴥ•ʔ \n";
    }

}
