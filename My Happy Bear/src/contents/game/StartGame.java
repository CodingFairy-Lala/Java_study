package contents.game;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import contents.resources.character.Bear;
import contents.resources.loginsystem.User;

public class StartGame {
    public static File userFile = new File("bearUsers.ser");

    public static void startGame(String inputId, String inputPassword) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userFile))) {
            Object obj = ois.readObject();
            User[] users = (User[]) obj;
            for (int i = 0; i < users.length; i++) {
                if (inputId.equals(users[i].getId()) && inputPassword.equals(users[i].getPassword())) {

                    if (users[i].getBearOwner() == true) {
                        PlayGame playGame = new PlayGame();
                        playGame.play(users[i].getMyBear());
                        if (users[i].getBearOwner() == false) { // 만약 게임오버되어 곰나라로 떠난 경우, 저장하지 않음
                            break;
                        }
                        if (users[i].getBearOwner() == true) {
                            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFile));) {
                                users[i].setMyBear(users[i].getMyBear()); // 곰돌이 저장
                                oos.writeObject(users);
                            }
                            break;
                        }
                    }

                    if (users[i].getBearOwner() == false) {
                        PlayGame playGame = new PlayGame();
                        MakeCharacter makeCharacter = new MakeCharacter();
                        Bear selectCharacter = makeCharacter.selectCharacter();
                        selectCharacter.setOwner(users[i].getNickname()); // 집사 이름 저장
                        playGame.play(selectCharacter);
                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFile));) {
                            users[i].setMyBear(selectCharacter);
                            users[i].isBearOwner(true);
                            oos.writeObject(users);
                        }
                        break;
                    }

                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void deleteBear(Bear bear) {
        String owner = bear.getOwner();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userFile))) {
            Object obj = ois.readObject();
            User[] users = (User[]) obj;
            for (int i = 0; i < users.length; i++) {
                if (owner.equals(users[i].getNickname()) == true) {
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFile));) {
                        users[i].setMyBear(null);
                        users[i].isBearOwner(false);
                        oos.writeObject(users);
                    }
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
