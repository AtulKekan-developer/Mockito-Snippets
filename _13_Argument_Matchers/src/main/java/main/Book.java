package main;

import java.time.LocalDate;

public class Book 
{
	private String id;
	private String name;
	private String author;
	private int price;
	private LocalDate date;
	
	public Book(String id, String name, String author, int price, LocalDate date) 
	{
		super();
		this.id = id;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
