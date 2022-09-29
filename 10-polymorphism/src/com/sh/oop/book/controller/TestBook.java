package com.sh.oop.book.controller;

import com.sh.oop.book.model.vo.Book;

/**
 * - 테스트 클래스 : com.sh.oop.book.controller.TestBook.java
 * //main() 포함
 * => 초기값을 부여한 두 개의 객체를 생성함
 * => 두 객체의 정보 출력 처리함 : toString() 사용
 * => 두 객체의 값이 일치하는지 결과 출력 : equals() 사용
 * => 첫번째 객체를 복제한 객체 생성함 : clone() 사용
 * => 첫번째 객체와 복제 객체의 주소가 같은지 출력
 * => 첫번째 객체와 복제 객체의 내용이 같은지 출력
 */

public class TestBook {

    public static void main(String[] args) {
        Book book = new Book("서시", "윤동주", 100_000_000);
        Book book2 = new Book("해리포터", "조앤", 10_000);

        // 두 객체의 정보 출력 처리함 : toString() 사용
        System.out.println(book.toString());
        System.out.println(book2.toString());
        // 두 객체의 값이 일치하는지 결과 출력 : equals() 사용 - false
        System.out.println(book.equals(book2));

        // 첫번째 객체를 복제한 객체 생성함 : clone() 사용
        Book book3 = new Book(book.clone());
        // 첫번째 객체와 복제 객체의 주소가 같은지 출력 - false
        System.out.println(book.hashCode() == book3.hashCode());
        // 첫번째 객체와 복제 객체의 내용이 같은지 출력 - true
        System.out.println(book.equals(book3));

    }
}
