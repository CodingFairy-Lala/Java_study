package com.sh.collection.map.book.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.sh.collection.map.book.model.compare.CategoryAsc;
import com.sh.collection.map.book.model.vo.Book;

public class BookManager {
	private Map<String, Book> bookMap = new HashMap<>();
	{
		bookMap.put("200", new Book("200", 2, "나미야 잡화점의 기적", "히가시노 게이고"));
		bookMap.put("100", new Book("100", 3, "파리의 아파트", "기욤 뮈소"));
		bookMap.put("400", new Book("400", 1, "ABCDE", "도레미"));
		bookMap.put("300", new Book("300", 2, "미중전쟁", "김진명"));
		bookMap.put("500", new Book("500", 1, "JAVA 삽질하기", "김동현"));
	}

	public void putBook(Book book) {
		bookMap.put(book.getbNo(), book);
	}

	public void deleteBook(String key) {
		if (bookMap.containsKey(key)) {
			Book removed = bookMap.remove(key); // 삭제된 Book객체 반환
			System.out.println(removed.getTitle() + " 도서를 삭제했습니다.");			
		}
		else
			System.out.println("해당 도서가 존재하지 않습니다.");
	}

	public String searchBook(String title) {
		Set<Map.Entry<String, Book>> entrySet = bookMap.entrySet();
		for (Map.Entry<String, Book> entry : entrySet) {
			String key = entry.getKey();
			Book value = entry.getValue();
			if (value.getTitle().equals(title))
				return key;
		}
		return null;
	}

	public void printBook(String key) {
		if (bookMap.containsKey(key))
			System.out.println(bookMap.get(key));
		else
			System.out.println("해당 도서가 존재하지 않습니다.");
	}

	public void printAll() {
		Set<String> keySet = bookMap.keySet();
		Iterator<String> iter = keySet.iterator();

		System.out.println();
		System.out.printf("%10s %10s %10s %10s%n", "번호", "카테고리", "제목", "작가");
		System.out.println("-------------------------------------------------------------");
		
		while(iter.hasNext()) {
			String key = iter.next();
			Book value = bookMap.get(key);
				System.out.printf("%10s %10s %10s %10s%n", 
									value.getbNo(),
									value.getCategory(),
									value.getTitle(),
									value.getAuthor());
		}
		System.out.println();
	}

	/**
	 * 저장된 순서를 기억하는 list -> list요소를 직접 수정해서 정렬
	 * 
	 * @return
	 */
	public Book[] sortedBookMap() {
		Book[] bookArr = new Book[bookMap.size()];
		// keyset -> key -> value을 배열로 옮겨담기
		Set<String> keySet = bookMap.keySet();
		int i = 0; 
		for(String key : keySet){
			bookArr[i++] = bookMap.get(key);
		}

		// 배열정렬에 배열과 배열기준객체를 제공한다
//		Arrays.sort(bookArr, null); // 기본정렬(Comparable#compareTo 오버라이드된 경우)
		Arrays.sort(bookArr, new CategoryAsc());
//		Arrays.sort(bookArr, Collections.reverseOrder(new CategoryAsc()));
		return bookArr;
	}

	public void printBookMap(Book[] bookArr) {
		System.out.println();
		System.out.printf("%10s %10s %10s %10s%n", "번호", "카테고리", "제목", "작가");
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < bookArr.length; i++) {
			System.out.printf("%10s %10s %10s %10s%n", 
								bookArr[i].getbNo(),
								bookArr[i].getCategory(),
								bookArr[i].getTitle(),
								bookArr[i].getAuthor());
		}
		System.out.println();
	}
}
