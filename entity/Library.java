package com.entity;

public class Library {
	private String name;
	private String area;
	private int pincode;
	private Book[] book = new Book[5];

	public Library(String name, String area, int pincode) {
		this.name = name;
		this.area = area;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public String getArea() {
		return area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Book[] getBooks() {
		return book;
	}

	public void setBooks(Book[] books) {
		this.book = books;
	}

}
