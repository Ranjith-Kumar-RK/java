package com.heraizen.fc.domain;

public class Books {

	private long id;
	private String title;
	private String author;
	private double price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public Books(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

}
