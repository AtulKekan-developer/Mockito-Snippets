package main;

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
		bookRepository.save(book);
	}
	
	public void addBook(BookRequest bookRequest)
	{
		Book book = new Book(bookRequest.getId(),bookRequest.getTitle(),bookRequest.getAuthor(),bookRequest.getPrice(),bookRequest.getDate());
		bookRepository.save(book);
	}
	
	public void updatePrice(String bookId,int discount)
	{
		if(bookId == null)
			return;
		Book book = bookRepository.findBookById(bookId);
		book.setPrice((int)(book.getPrice() - book.getPrice()*(discount/100.0)));
		bookRepository.save(book);
	}
	
	public void updatePriceVer(String bookId,int discount)
	{
		if(bookId == null)
			return;
		Book book = bookRepository.findBookById(bookId);
		if(book.getPrice()==discount)
			return;
		book.setPrice((int)(book.getPrice() - book.getPrice()*(discount/100.0)));
		bookRepository.save(book);
	}
}
