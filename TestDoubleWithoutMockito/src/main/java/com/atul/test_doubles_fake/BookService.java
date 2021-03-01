package com.atul.test_doubles_fake;

import java.util.Collection;

public class BookService 
{
	private BookRepository bookRepository;	
	
	public BookService(BookRepository bookRepository) 
	{
		this.bookRepository = bookRepository;
	}

	public void addBook(Book book)
	{
		bookRepository.save(book);
	}
	
	public Collection<Book> getBooks()
	{
		return bookRepository.findAll();
	}
	
	public int findNumberOfBooks()
	{
		return bookRepository.findAll().size();
	}
}
