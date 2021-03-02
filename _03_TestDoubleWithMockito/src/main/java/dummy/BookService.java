package dummy;

import java.util.Collection;

public class BookService 
{
	private BookRepository bookRepository;	
	private EmailService emailService;	

	public BookService(BookRepository bookRepository, EmailService emailService) {
		super();
		this.bookRepository = bookRepository;
		this.emailService = emailService;
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
