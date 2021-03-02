package stub;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import org.junit.jupiter.api.Test;

import com.atul.test_doubles_stub.Book;
import com.atul.test_doubles_stub.BookRepository;
import com.atul.test_doubles_stub.BookService;

class StubTest 
{
	@Test
	void stubTest() 
	{
		BookRepository bookRepository = new BookRepositoryStub();
		BookService bookService = new BookService(bookRepository);
		Collection<Book> bookList = bookService.findNewBooks(10);
		assertEquals(5,bookList.size());	
	}
}
