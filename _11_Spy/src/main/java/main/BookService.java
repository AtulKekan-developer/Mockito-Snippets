package main;

public class BookService 
{

	public Book findBook(String bookId) {
		 //db implementation
		return null;
	}

	public int getAppliedDiscount(Book book, int discountRate)
	{
		int discountedPrice = (int) (book.getPrice() - discountRate);
		return discountedPrice;
	}
		
}
