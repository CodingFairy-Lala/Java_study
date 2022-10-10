package ncs.test3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTest {

    public static void main(String[] args) {
        DateTimeFormatter formatKor = DateTimeFormatter.ofPattern("yyyy년 M월 dd일");
        DateTimeFormatter day = DateTimeFormatter.ofPattern("E요일");

        LocalDate date1 = LocalDate.of(1987, 5, 27);
        LocalDate date2 = LocalDate.now();
        // 나이 계산
        Period period = Period.between(date1, date2);

        System.out.println("생일 : " + date1.format(formatKor) + " " + date1.format(day));
        System.out.println("현재 : " + date2.format(formatKor));
        System.out.println("나이 : " + period.getYears() + "세");

    }

}
