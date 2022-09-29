package com.sh.api.member.model.vo;

/**
 * [StringTokenizer 실습문제]

<문제1> 
다음과 같이 회원정보를 하나의 문자열로 담았다. 각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)이다.

    "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"

각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다.

출력메소드를 통해 회원정보를 출력한다.

- 회원 com.sh.api.member.model.vo.member
    - memberNo : int
    - memberName : String
    - height : int
    - weight : int
    - birth : Calendar
    + information() : String

- 실행클래스 com.sh.api.member.run.Run 
 */

import java.util.Calendar;

public class Member {
    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private Calendar birth;

    public Member() {
    }

    public Member(int memberNo, String memberName, int height, int weight, Calendar birth) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public int getMemberNo() {
        return this.memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Calendar getBirth() {
        return this.birth;
    }

    public void setBirth(Calendar birth) {
        this.birth = birth;
    }

    public String information() {
        return toString();
    }

    @Override
    public String toString() {
        return "[" +
                " memberNo='" + getMemberNo() + "'" +
                ", memberName='" + getMemberName() + "'" +
                ", height='" + getHeight() + "'" +
                ", weight='" + getWeight() + "'" +
                ", birth='" + getBirth().get(Calendar.YEAR) + "." + (getBirth().get(Calendar.MONTH) + 1) + "."
                + getBirth().get(Calendar.DATE) + "']";
    }

}
