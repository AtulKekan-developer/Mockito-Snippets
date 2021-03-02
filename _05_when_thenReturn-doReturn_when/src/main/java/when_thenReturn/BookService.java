package when_thenReturn;
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
	
	public double getTotalBookCost(List<String> ids)
	{
		double totalCost = 0.0;
		for(String id:ids)
		{
			Book book = bookRepository.findBookById(id);
			totalCost = totalCost + book.getPrice();
		}
		return totalCost;
	}	
}
