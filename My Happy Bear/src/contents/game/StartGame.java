package contents.game;

import contents.resources.character.Bear;

public class StartGame {

    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        MakeCharacter makeCharacter = new MakeCharacter();
        Bear selectCharacter = makeCharacter.selectCharacter();
        playGame.play(selectCharacter);
    }
}
