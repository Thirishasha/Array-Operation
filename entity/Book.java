package com.entity;

public class Book {
	private int id;
	private String name;
	private String auther;
	private double price;

	public Book(int id, String name, String auther, double price) {
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuther() {
		return auther;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public void setPrice(double price2) {
		this.price = price2;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", auther=" + auther + ", price=" + price + "]";
	}

}
