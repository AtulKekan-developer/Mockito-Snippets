package main;

import java.sql.SQLException;

public class BookService 
{
	private BookRepository  bookRepository;

	public BookService(BookRepository bookRepository) 
	{
		super();
		this.bookRepository = bookRepository;
	}
	
	public void save(Book book)
	{
		if(book.getPrice()<=500)
			return;
		try {
			bookRepository.save(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void updatePrice(String bookId,int discount) throws SQLException
	{
		if(bookId == null)
			return;
		
		Book book = null;
		
		
			book = bookRepository.findBookById(bookId);
			book.setPrice((int)(book.getPrice() - book.getPrice()*(discount/100.0)));
			bookRepository.save(book);		
	}	
	
	public void addBook(Book book) throws SQLException
	{
		bookRepository.save(book);
	}	
	
	public void addBookUsingRequest(BookRequest bookRequest)
	{
		Book book = new Book(bookRequest.getId(),bookRequest.getTitle(),bookRequest.getAuthor(),bookRequest.getPrice(),bookRequest.getDate());
		try {
			bookRepository.save(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
