package com.sh.api.member.run;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import com.sh.api.member.model.vo.Member;

/**
 * [StringTokenizer 실습문제]
 * 
 * <문제1>
 * 다음과 같이 회원정보를 하나의 문자열로 담았다. 각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)이다.
 * 
 * "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"
 * 
 * 각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다.
 * 
 * 출력메소드를 통해 회원정보를 출력한다.
 * 
 * - 실행클래스 com.sh.api.member.run.Run
 */

public class Run {

    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        String info = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        // 3명의 회원정보로 분리
        StringTokenizer tokenizer = new StringTokenizer(info, "|");
        String[] infos = new String[3];
        int n = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            infos[n++] = token;
        }

        // 회원 객체 배열에 추가 및 회원정보 출력
        Member[] members = new Member[3];
        for (int i = 0; i < members.length; i++) {
            members[i] = new Member();
            String[] str = infos[i].split(",");
            for (int j = 0; j < str.length; j++) {
                members[i].setMemberNo(Integer.parseInt(str[j]));
                members[i].setMemberName(str[++j]);
                members[i].setHeight(Integer.parseInt(str[++j]));
                members[i].setWeight(Integer.parseInt(str[++j]));
                // Calendar 클래스로 변환
                Date date = df.parse(str[++j]);
                cal.setTime(date);
                members[i].setBirth(cal);
            }
            System.out.println(members[i].information());
        }

    }
}
