package contents.resources.character;

public interface Bear {
    public int happiness = 50;
    public int satiety = 50;
    public int health = 70;
    public int cleanliness = 70;

    public void eat();

    public void exercise();

    public void shower();

    public void sleep();

    public void clean();

    public void cure();

    public void printInfo();

    public boolean endGame();

}
