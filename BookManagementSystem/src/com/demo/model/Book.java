package com.demo.model;

public class Book {
	/**
	 *Model class for book management system 
	 *
	 */
	
	private String bname;
	private String isbn;
	private double price;
	private String author;
	
	public Book() {
		super();
	}

	public Book(String bname, String isbn, double price, String author) {
		super();
		this.bname = bname;
		this.isbn = isbn;
		this.price = price;
		this.author = author;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bname=" + bname + ", isbn=" + isbn + ", price=" + price + ", author=" + author + "]";
	}
}
