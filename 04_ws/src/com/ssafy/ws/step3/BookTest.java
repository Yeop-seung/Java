package com.ssafy.ws.step3;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법");
		Book b2 = new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용");
		Book b3 = new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링");

		BookManager bm = new BookManager();
		// 책 등록 작업===================
		bm.add(b1);
		bm.add(b2);
		bm.add(b3);

		// 책 전체 목록===================
		System.out.println("****************************************도서목록****************************************");
		for (Book book : bm.getList()) {
			System.out.println(book);
		}
//		for (int i = 0; i < books.length; i++) {
//			System.out.println(books[i].toString());
//		}
		System.out.println("****************************************도서조회 : 21424****************************************");
		Book book = bm.searchByIsbn("21424");
		if (book == null) {
			System.out.println("21424에 해당하는 도서가 존재하지 않습니다.");
		} else {
			System.out.println(book.toString());
		}

		System.out.println("****************************************도서삭제 : 21424****************************************");
		bm.remove("21424");

		System.out.println("****************************************도서목록****************************************");
		for (Book b : bm.getList()) {
			System.out.println(b);
		}

	}

}
