package com.atul.test_doubles_spy;

public class BookService 
{	
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) 
	{
		this.bookRepository = bookRepository;
	}

	public void saveBook(Book book)
	{
		bookRepository.saveBook(book);
	}
}
