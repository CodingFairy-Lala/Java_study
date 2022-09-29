package sh.java.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * java.util.Date
 * java.util.Calendar
 * 
 * java 1.8부터 지원
 * java.time.LocalDate
 * java.time.LocalDateTime
 * java.time.LocalTime
 * 
 * 
 */

public class LocalDateTimeStudy {

    public static void main(String[] args) {
        LocalDateTimeStudy study = new LocalDateTimeStudy();
        // study.test1();
        // study.test2();
        // study.test3();
        // study.test4();
        // study.test5();
        // study.test6();
        study.test7();

    }

    public void test7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("생일을 입력하세요 (yyyymmdd) > ");
        String text = sc.next();

        LocalDate bday = LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(bday.format(DateTimeFormatter.ofPattern("당신은 E요일에 태어나셨습니다.")));

    }

    /**
     * @실습문제 : 사용자로부터 생일(년도, 월, 일)을 입력받고, 요일을 출력하세요.
     *       - 당신은 화요일에 태어나셨습니다.
     * 
     *       int -> LocalDate
     *       String -> LocalDate : LacalDate
     * 
     */
    public void test6() {
        Scanner sc = new Scanner(System.in);

        System.out.print("생일을 숫자로 입력하세요 > \n");
        System.out.print("1. 연도 : ");
        int year = sc.nextInt();
        System.out.print("2. 월 : ");
        int month = sc.nextInt();
        System.out.print("3. 일 : ");
        int day = sc.nextInt();
        LocalDate getDay = LocalDate.of(year, month, day);

        char[] dayOfWeek = { '월', '화', '수', '목', '금', '토', '일' };
        System.out.println("당신은 " + dayOfWeek[getDay.getDayOfWeek().getValue() - 1] + "요일에 태어나셨습니다.");
        System.out.println(getDay.format(DateTimeFormatter.ofPattern("당신은 E요일에 태어나셨습니다.")));

    }

    /**
     * 날짜 차이 구하기
     * 1. ChronoUnit.DAYS.between(startInclusive:Temporal,
     * endExclusive:Temporal):long
     * 2. LocalDate#until:Period(endExclusive:ChronoLocalDate):Period
     */
    public void test5() {
        LocalDate start = LocalDate.now();
        LocalDate end = LocalDate.of(2022, 12, 25);

        long diff = ChronoUnit.DAYS.between(start, end);
        System.out.println(diff);

        Period period = start.until(end);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }

    /**
     * 특정 형식으로 변환
     * DateTimeFormatter
     */
    public void test4() {
        LocalDateTime now = LocalDateTime.now();
        // LocalDateTime now = new LocalDateTime.now();

        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        // y 년도, M 월, d 일, H 시간(24), m 분, s 초
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초"))); // E 요일 a 오전오후 h
                                                                                                   // 시간(12)

    }

    /**
     * LocalTime
     */
    public void test3() {
        LocalTime now = LocalTime.now();
        System.out.println(now);
    }

    /**
     * LocalDateTime
     */
    public void test2() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 밀리-나노-마이크로 초까지 제공함

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

    }

    /**
     * LocalDate
     */
    public void test1() {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.getYear());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.isLeapYear()); // 윤년인지 확인
        System.out.println(today.getDayOfWeek()); // DayOfWeek 객체 반환
        System.out.println(today.getDayOfWeek().getValue()); // 월(1) 화(2) 수(3) ... 일(7)

        char[] dayOfWeek = { '월', '화', '수', '목', '금', '토', '일' };
        System.out.println(dayOfWeek[today.getDayOfWeek().getValue() - 1]);

        LocalDate dday = LocalDate.of(2022, 12, 25); // 특정일자를 지정일로 만들 수 있음
        System.out.println(dday);
        System.out.println(dayOfWeek[dday.getDayOfWeek().getValue() - 1]);
    }
}
