package mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MockTest 
{
	@Test
	void mockTest() 
	{
		BookRepository bookRepository = mock(BookRepository.class);
		BookService bookService = new BookService(bookRepository);
		
		Book book = new Book("1","A",100,LocalDate.now());
		bookService.saveBook(book);
		verify(bookRepository).saveBook(book);//verify whether saveBook was called or not for bookRepository
		
		book = new Book("2","B",200,LocalDate.now());
		bookService.saveBook(book);
		verify(bookRepository,Mockito.times(1)).saveBook(book);//verify whether saveBook was called or not for bookRepository		
	}
}
