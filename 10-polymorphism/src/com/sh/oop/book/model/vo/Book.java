package com.sh.oop.book.model.vo;

import java.util.Objects;

/**
 * @실습문제1
 *        - 패키지명 : com.sh.oop.book.model.vo
 *        - 클래스명 : Book
 *        //Field
 *        - title : String //책제목
 *        - author : String //저자명
 *        - price : int //가격
 * 
 *        //기본생성자와 매개변수 생성자 작성함
 *        //Getter and Setter 작성함
 *        // Object 클래스의 toString() 메소드 오버라이딩함
 *        => 객체의 모든 필드값 문자열 합치기해서 리턴함
 *        // Object 클래스의 equals() 메소드 오버라이딩함
 *        => 두 객체의 모든 필드값이 일치하는지를 물어서
 *        모두 일치하면 true,
 *        하나라도 다르면 false를 리턴함
 *        // Object 클래스의 clone() 메소드 오버라이딩함
 *        => 접근제한자는 public 으로 변경함
 *        => 예외처리는 삭제함
 *        => (복사생성자 구현)this가 가리키는 객체가 가진 값을 복사한 새 객체 생성하고 주소 리턴함
 *        - 테스트 클래스 : com.sh.oop.book.controller.TestBook.java
 *        //main() 포함
 *        => 초기값을 부여한 두 개의 객체를 생성함
 *        => 두 객체의 정보 출력 처리함 : toString() 사용
 *        => 두 객체의 값이 일치하는지 결과 출력 : equals() 사용
 *        => 첫번째 객체를 복제한 객체 생성함 : clone() 사용
 *        => 첫번째 객체와 복제 객체의 주소가 같은지 출력
 *        => 첫번째 객체와 복제 객체의 내용이 같은지 출력
 */

public class Book {

    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * 복제 생성자
     * 
     * @return
     */
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                " title='" + getTitle() + "'" +
                ", author='" + getAuthor() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && price == book.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public Book clone() { // 공변반환타입
        return new Book(this);
    }

}
