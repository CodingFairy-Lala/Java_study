package com.sh.io.test4.controller;

import java.time.LocalDate;
import java.util.Scanner;

import com.sh.io.test4.model.vo.Book;

public class BookManager {

    Scanner sc = new Scanner(System.in);

    BookManager() {
        super();
    }

    public void fileSave() {
        Book[] books = new Book[5];
        {
            books[0] = new Book("자바의 정석", "김자바", 20000, LocalDate.of(1990, 5, 5));
            books[1] = new Book("카밍 시그널", "김카밍", 30000, LocalDate.of(1995, 8, 5));
            books[2] = new Book("해리 포터", "조앤롤링", 15000, LocalDate.of(1994, 3, 19));
            books[3] = new Book("파이썬의 정석", "김코딩", 45000, LocalDate.of(2001, 10, 1));
            books[4] = new Book("c언어의 정석", "박코딩", 15000, LocalDate.of(1890, 8, 28));
        }

    }

}
