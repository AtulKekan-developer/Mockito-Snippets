package main;

public class BookManager {
	private BookService bookService;

	public BookManager(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	public int applyDiscountOnBook(String bookId,int discountRate)
	{
		Book book = bookService.findBook(bookId);//we need to mock 
		int discountedPrice = bookService.getAppliedDiscount(book,discountRate);// we need to call original method
		return discountedPrice;
	}
}
