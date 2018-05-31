package com.example.test;

public class Book {

	String title;
	String author;
	int id;
	
	
	

	public Book(int id, String title, String author ) {
		super();
		this.title = title;
		this.author = author;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
