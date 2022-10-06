package com.sh.io.test2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentMain main = new StudentMain();
        main.test1();
        main.test2();

    }

    /**
     * student.ser의 내용을 불러와 (객체 읽어오기)
     * 다음과 같이 출력
     *
     * 1 홍길동 80 70 75.5
     * 2 신사임당 90 50 70.0
     */
    private void test2() {
        File studentFile = new File("students.ser");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(studentFile))) {
            Object obj = ois.readObject();
            Student[] students = (Student[]) obj;
            for (Student student : students) {
                if (student == null) {
                    break;
                }
                System.out.print(student.getNo() + " ");
                System.out.print(student.getName() + " ");
                System.out.print(student.getKor() + " ");
                System.out.print(student.getEng() + " ");
                System.out.print((double) ((student.getKor() + student.getEng()) / 2.0));
                System.out.println();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 학생 2명의 이름, 국어점수, 영어점수를 입력받아 학생 객체를 생성하고, 배열에 추가.
     * - 학생 번호는 1부터 순차적으로 부여.
     *
     * 생성된 배열을 students.ser에 저장 (객체 출력)
     */
    private void test1() {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        int index = 0; // 다음 객체의 index | 이제까지 입력된 객체 수
        // 입력부
        for (int i = 0; i < students.length; i++) {
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();

            students[index++] = new Student(i + 1, name, kor, eng);

            System.out.print("계속 입력하시겠습니까? (y/n) : ");
            if (sc.next().charAt(0) == 'n') {
                break;
            }
        }

        File studentFile = new File("students.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(studentFile)))) {
            oos.writeObject(students);
            System.out.println("students 객체 출력 완료!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
