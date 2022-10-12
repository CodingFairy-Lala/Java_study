package com.sh.collection.map.book.model.compare;

import java.util.Comparator;

import com.sh.collection.map.book.model.vo.Book;

/**
 * category - title 오름차순 정렬
 * 
 *
 */
public class CategoryTitleAsc implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		if (b1.getCategory() - b2.getCategory() > 0) {
			return 1;
		} else if (b1.getCategory() - b2.getCategory() < 0) {
			return -1;
		} else {
			return b1.getTitle().compareTo(b2.getTitle());
		}
	}
}