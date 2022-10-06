package com.sh.io.test2;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private int no;
    private String name;
    private int kor;
    private int eng;

    public Student() {
    }

    public Student(int no, String name, int kor, int eng) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public int getNo() {
        return this.no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return this.kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return this.eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "{" +
                " no='" + getNo() + "'" +
                ", name='" + getName() + "'" +
                ", kor='" + getKor() + "'" +
                ", eng='" + getEng() + "'" +
                "}";
    }

}
