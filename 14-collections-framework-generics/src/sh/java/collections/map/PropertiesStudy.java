package sh.java.collections.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesStudy {

    /**
     * Properties
     * - HashTable 상속
     * - K,V 타입을 String, String 으로 단순화한 map 클래스.
     * - 환경설정 정보 등을 관리하는데 최적화.
     * 
     */
    public static void main(String[] args) {

        PropertiesStudy study = new PropertiesStudy();
         study.test1();
         study.test3();
        study.test3();

    }

    /**
     * @실습문제 : resources/app.properties 파일 읽어와서 출력하기
     */
    private void test3() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(
                    "/Users/hera/Desktop/java workspaces/14-collections-framework-generics/resources/app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(prop);

    }

    /**
     * file -> prop 객체 불러오기
     */

    private void test2() {
        Properties prop = new Properties();
        File srcFile = new File("user.properties");
        try {
            // prop.load(new FileReader(srcFile));
            prop.loadFromXML(new FileInputStream("user.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(prop);

        // 특정요소 가져오기
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        String url = prop.getProperty("url");
        String xxx = prop.getProperty("xxx");

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("url = " + url);
        System.out.println("xxx = " + xxx); // null

        // 모든 요소 열람 (keySet과 유사)
        Set<String> keySet = prop.stringPropertyNames();
        for (String key : keySet) {
            System.out.println(key + " = " + prop.getProperty(key));
        }

        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            String value = prop.getProperty(key);
            System.out.println(key + " = " + value);
        }
    }

    /**
     * prop객체 -> file 저장
     */
    private void test1() {
        Properties prop = new Properties();
        prop.setProperty("username", "honggd");
        prop.setProperty("password", "1234");
        prop.setProperty("url", "http://honggd.space");
        System.out.println(prop);

        // 파일에 쓰기
        File destFile = new File("user.properties");
        try {
            prop.store(new FileWriter(destFile), "user information"); // 출력 스트림, 주석
            prop.storeToXML(new FileOutputStream("user.xml"), "user information");

            System.out.println("user.properties 출력 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
