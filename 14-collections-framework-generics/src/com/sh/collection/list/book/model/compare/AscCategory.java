package com.sh.collection.list.book.model.compare;

import java.util.Comparator;

import com.sh.collection.list.book.model.vo.Book;

public class AscCategory implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		return b1.getCategory()-b2.getCategory();
	}

}


//public class AscCategory implements Comparator<Book> {
//	@Override
//	public int compare(Book b1, Book b2){
//		int result = 0;
//		if(b1.getCategory()-b2.getCategory() > 0){
//			result = 1;
//		}
//		else if(b1.getCategory()-b2.getCategory() < 0){
//			result = -1;
//		}
//		else {
//			if(b1.getTitle().compareTo(b2.getTitle())<0)
//				result = -1;
//			else if (b1.getTitle().compareTo(b2.getTitle())>0)
//				result = 1;
//			else 
//				result = 0;
//		}
//		
//		return result;
//	}
//}