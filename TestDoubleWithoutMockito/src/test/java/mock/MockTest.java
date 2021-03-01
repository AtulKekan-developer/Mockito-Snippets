package mock;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.atul.test_doubles_mock.Book;
import com.atul.test_doubles_mock.BookRepository;
import com.atul.test_doubles_mock.BookService;

class MockTest {

	@Test
	void mockTest() 
	{
		BookRepository bookRepository = new BookRepositoryMock();
		BookService bookService = new BookService(bookRepository);
		
		Book book = new Book("1","A",100,LocalDate.now());
		bookService.saveBook(book);
		((BookRepositoryMock)bookRepository).verify(book,1);
		
		book = new Book("2","B",200,LocalDate.now());
		bookService.saveBook(book);
		((BookRepositoryMock)bookRepository).verify(book,2);
		
	}

}
