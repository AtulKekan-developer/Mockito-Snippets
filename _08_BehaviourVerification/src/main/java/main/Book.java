package main;

import java.time.LocalDate;

public class Book 
{
	private String id;
	private String title;
	private String author;
	private int price;
	private LocalDate date;
	
	public Book(String id, String title, String author, int price, LocalDate date) 
	{
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
