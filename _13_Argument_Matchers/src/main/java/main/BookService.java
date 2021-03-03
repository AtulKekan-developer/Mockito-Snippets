package main;

import java.util.List;

public class BookService 
{
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}	
	
	public void save(Book book)
	{
		bookRepository.save(book);
	}
	
	public Book findBook(String id)
	{
		return bookRepository.findBookById(id);
	}
	
	public List<Book> allBooks()
	{
		return bookRepository.findAll();
	}	
}
