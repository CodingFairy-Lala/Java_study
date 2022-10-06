package sh.java.io._byte.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class ObjectIOStudy {

    public static void main(String[] args) {
        ObjectIOStudy study = new ObjectIOStudy();
        study.test1();
        study.test2();

    }

    /**
     * User 객체 입력하기
     * 
     * - User객체를 userFile로부터 읽어오기
     */

    private void test2() {
        File userFile = new File("users.ser");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userFile))) {
            Object obj = ois.readObject();
            User[] users = (User[]) obj;
            for (User user : users) {
                System.out.println(user);
                System.out.println(user.getUsername());
                System.out.println(user.getPassword());
                System.out.println(user.getBirthday());
                System.out.println();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * User객체 출력하기
     * 
     * - 객체 단위로 파일에 쓰기
     */
    private void test1() {
        // User user = new User("honggd", "1234", LocalDate.of(1999, 9, 9));
        User[] users = {
                new User("honggd", "1234", LocalDate.of(1999, 9, 9)),
                new User("sinsa", "1234", LocalDate.of(1992, 7, 15)),
                new User("leess", "1234", LocalDate.of(1977, 7, 7))
        };
        File userFile = new File("users.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFile));) {
            oos.writeObject(users);
            System.out.println("users 객체 출력 완료!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
