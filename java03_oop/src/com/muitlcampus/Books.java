package com.muitlcampus;

public class Books {

	protected String bookName = "°³¹Ì";
	protected int price = 100;
	protected Books() {
	}
	
	public Books(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	protected int getPrice() {
		return price;
	}
}
