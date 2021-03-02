package stub;

import java.util.Collection;

public class BookService 
{
	//stub
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) 
	{
		this.bookRepository = bookRepository;
	}

	public Collection<Book> findNewBooks(int daysPublishedBefore)
	{
		return bookRepository.findNewBooks(daysPublishedBefore);
	}
}
