package com.ssafy.ws.step3;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;

	public Book() {
	}

	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	public String toString() {
		String sendMsg = isbn + "	|  " + title + "	| " + author + "	| " + publisher + "	|  " + price + "	|  "
				+ desc;

		return sendMsg;
	}

}
