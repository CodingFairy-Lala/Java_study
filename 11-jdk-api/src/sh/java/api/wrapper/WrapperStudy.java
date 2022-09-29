package sh.java.api.wrapper;

import java.net.Inet4Address;
import java.util.ArrayList;

/**
 * Wrapper 클래스
 * - 기본형(값)을 감싸서 객체화 할 수 있는 클래스
 * - 기본형 8가지에 상응하는 wrapper 클래스가 java.lang패키지에 존재한다.
 * 
 * - 기본형을 generics문법에 사용하는 경우
 * - 기본형 타입별로 부가기능(필드/메소드)이 필요한 경우
 * 
 * boolean -> Boolean
 * 
 * char -> Character
 * 
 * byte -> Byte
 * short -> Short
 * int -> Integer
 * long -> Long
 * 
 * float -> Float
 * double -> Double
 * 
 */

public class WrapperStudy {

    public static void main(String[] args) {
        WrapperStudy study = new WrapperStudy();
        // study.test1();
        // study.test2();
        study.test3();

    }

    /**
     * 기본형 값을 문자열로 변환
     */
    public void test3() {
        int num = 12345;
        // String snum = "" + num;
        String snum = String.valueOf(num);
        System.out.println(snum.substring(2, 3));

    }

    /**
     * String -> 각 기본형값으로 변환
     */
    public void test2() {
        int i = Integer.parseInt("123");
        System.out.println(i + 1);

        double d = Double.parseDouble("34.56");
        System.out.println(d + 1);

        Boolean bool = Boolean.parseBoolean("true");
        System.out.println(!bool);

        char ch = "abcdr".charAt(0); // Char.parsChar는 없음
        System.out.println(ch);
    }

    /**
     * auto-boxing
     * auto-unboxing
     */

    public void test1() {
        int n = 100;
        Integer m = Integer.valueOf(100); // boxing - 기본형을 객체화 함

        // auto - boxing
        Integer x = 100; // 자동으로 integer.valueOf(100) 처리

        // auto - unboxing
        int y = x; // int y = x.intValue(); 자동으로 객체를 기본형으로 풀어냄
        System.out.println(y);

        System.out.println(n + m); // int + Integer -> int Integer#intValue -> int + int

        // 제네릭스 문법 (타입 체크)
        ArrayList<Integer> list = new ArrayList<Integer>(); // 배열에 Integer만 담을 수 있음
        // ArrayList<int> list = new ArrayList<int>(); // 제네릭스에 기본형 사용불가

        Double dnum = 3.6; // Double.valueOf(3.5);
        double _dnum = dnum; // Double#doubleValue():double

    }

}
