package support;

import java.util.List;

public class BookService 
{
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) 
	{
		super();
		this.bookRepository = bookRepository;
	}
	
	public List<Book> findNewBooksWithAppliedDiscount(int days,int discount)
	{
		List<Book> bookList = bookRepository.findLatestPublishedBooks(days);
		for(Book book:bookList)
		{
			if(book.getPrice()>500)
			{
				double disc = book.getPrice()*(discount/100.0);
				book.setPrice(book.getPrice()-disc);
			}
		}
		return bookList;
	}
}
