package main;

public class BookService 
{
	private BookRepository  bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public void save(Book book)
	{
		bookRepository.save(book);
	}
}
