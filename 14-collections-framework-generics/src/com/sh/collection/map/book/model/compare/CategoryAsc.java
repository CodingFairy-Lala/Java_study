package com.sh.collection.map.book.model.compare;

import java.util.Comparator;

import com.sh.collection.map.book.model.vo.Book;

public class CategoryAsc implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		return b1.getCategory() - b2.getCategory();
	}

}