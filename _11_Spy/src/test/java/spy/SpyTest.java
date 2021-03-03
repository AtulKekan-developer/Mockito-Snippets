package spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import main.Book;
import main.BookManager;
import main.BookService;

@ExtendWith(MockitoExtension.class)
class SpyTest 
{
	@InjectMocks
	private BookManager bookManager;
	
	@Spy
	private BookService bookService;
	
	@Test
	void spyTest() 
	{
		//we need to mock getBook of mock object
		//we need to call actual getAppliedDiscount method of mock object
		//it is possible only in case of spy
		Book book = new Book("1","A","B",500,LocalDate.now());
		doReturn(book).when(bookService).findBook("1");//use for spy avoid using when - thenReturn
		int discountedPrice = bookManager.applyDiscountOnBook("1",45);
		assertEquals(455,discountedPrice);
	}
}
