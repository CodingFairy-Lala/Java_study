package com.sh.collection.list.book.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sh.collection.list.book.model.compare.AscCategory;
import com.sh.collection.list.book.model.vo.Book;

public class BookManager {
	private List<Book> bookList = new ArrayList<>();
	{
		bookList.add(new Book("200", 2, "나미야 잡화점의 기적", "히가시노 게이고"));
		bookList.add(new Book("100", 3, "파리의 아파트", "기욤 뮈소"));
		bookList.add(new Book("400", 1, "ABCDE", "도레미"));
		bookList.add(new Book("300", 2, "미중전쟁", "김진명"));
		bookList.add(new Book("500", 1, "JAVA 삽질하기", "김동현"));
	}

	public BookManager() {
	}

	public BookManager(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void deleteBook(int index) {
		if (bookList.get(index) != null)
			bookList.remove(index);
		else
			System.out.println("해당 도서가 존재하지 않습니다.");
	}

	public int searchBook(String title) {
		for (int i = 0; i < bookList.size(); i++) {
			Book b = bookList.get(i);
			if (title.equals(b.getTitle()))
				return i;
		}
		return -1;
	}

	public void printBook(int index) {
		if (bookList.get(index) != null)
			System.out.println(bookList.get(index));
		else
			System.out.println("해당 도서가 존재하지 않습니다.");
	}

	public void printAll() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	/**
	 * 저장된 순서를 기억하는 list -> list요소를 직접 수정해서 정렬
	 * 
	 * @return
	 */
	public Book[] sortedBookList() {
		// List를 직접 정렬하게 되면, 실제 리스트의 저장순서(index)가 바뀌므로 
		// 정렬은 보통 배열복사 또는 리스트복사를 통해 이루어진다.
//		Collections.sort(bookList, new AscCategory());
//		System.out.println(bookList);

		Book[] bookArr = new Book[bookList.size()];
		// 1.collection을 배열로 옮겨담기
//		for(int i=0; i<bookArr.length; i++){
//			bookArr[i] = bookList.get(i);
//		}

		// 2. 빈 Book[]객체를 toArray메소드 인자로 전달
		bookList.toArray(bookArr);

		// list로 복제하는 경우
		List<Book> copyList1 = new ArrayList<>(bookList);
		List<Book> copyList2 = (List<Book>) ((ArrayList<Book>) bookList).clone();

		// 배열정렬에 배열과 배열기준객체를 제공한다
		// <Book> void java.util.Arrays.sort(Book[] a, Comparator<? super Book> c)
//		Arrays.sort(bookArr, null); // 기본정렬(Comparable#compareTo 오버라이드된 경우)
//		Arrays.sort(bookArr, new AscCategory());
		Arrays.sort(bookArr, Collections.reverseOrder(new AscCategory()));
		return bookArr;
	}

	public void printBookList(Book[] bookArr) {
		for (int i = 0; i < bookArr.length; i++) {
			System.out.println(bookArr[i]);
		}
	}
}
