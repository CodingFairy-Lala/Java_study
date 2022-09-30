package sh.java.api.math;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class MathStudy {

    public static void main(String[] args) {
        MathStudy study = new MathStudy();
        study.test1();

    }

    /**
     * 올림 Math.ceil(double):double
     * 버림 Math.floor(double):double
     * 반올림 Math.round(double):long
     */
    private void test1() {
        // 올림 7.8
        System.out.println(Math.ceil(7.8));

        // 3.453 올림해서 소수점 이하 둘째자리까지 표현 -> 3.46
        // 3.453 -> 345.3 -> 346.0 -> 3.46
        double dnum = 3.453;
        System.out.println(Math.ceil(dnum * 100) / 100);

        // 버림 7.8
        System.out.println(Math.floor(7.8)); // 7.0

        // 3.453 버림해서 소수점 이하 둘째자리까지 표현 - > 3.45
        System.out.println(Math.floor(dnum * 100) / 100);

        // 반올림 7.5
        System.out.println(Math.round(7.5)); // 8
        System.out.println(Math.round(7.4)); // 7

        // 94.527 반올림해서 소수점 이하 둘째자리까지 ㅠㅛ현 -> 94.53
        // 94.527 -> 9452.7 -> 9453 -> 94.53
        System.out.println(Math.round(94.527 * 100) * 0.01);

    }
}
