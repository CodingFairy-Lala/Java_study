package contents.game;

import contents.resources.character.Bear;
import contents.resources.loginsystem.User;

public class StartGame {

    public static void startGame() {
        User user = new User();

        PlayGame playGame = new PlayGame();
        MakeCharacter makeCharacter = new MakeCharacter();
        Bear selectCharacter = makeCharacter.selectCharacter();
        // user.setMyBear(selectCharacter);
        playGame.play(selectCharacter);
    }
}
