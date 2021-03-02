package support;

import java.time.LocalDate;

public class Book 
{
	private int id;
	private String name;
	private String author;
	private LocalDate publishDate;	
	private double price;
	public Book(int id, String name, String author, LocalDate publishDate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishDate = publishDate;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}