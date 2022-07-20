package com.ssafy.ws.step3;

import java.util.Arrays;

public class BookManager {
	private static int MAX_SIZE = 10; // 관리할 최대 도서 수
	private Book[] books = new Book[MAX_SIZE]; // 관리할 도서 배열
	private int size; // 실제 관리되는 도서 수

	public void add(Book book) {
		if (size < MAX_SIZE) {
			books[size++] = book;
		}
	}

	public void remove(String isbn) {
		for (int i = 0; i < size; i++) {
			Book book = books[i];
			if (book.getIsbn().endsWith(isbn)) {
//				for (int j = i; j < size - 1; j++) {
//					books[j] = books[j + 1];
//				}
				System.arraycopy(books, i+1, books, i, size-i);
				books[--size] = null;
			}
		}
	}

	public Book[] getList() {
//		Book[] temp = new Book[size];
//		for (int i = 0; i < size; i++) {
//			temp[i] = books[i];
//		}
//		return temp;

		return Arrays.copyOf(books, size);
	}

	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < size; i++) {
			Book book = books[i];
			if (book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return null;
	}
}
