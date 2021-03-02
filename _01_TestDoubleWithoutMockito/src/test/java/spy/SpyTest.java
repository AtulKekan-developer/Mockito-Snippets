package spy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.atul.test_doubles_spy.Book;
import com.atul.test_doubles_spy.BookRepository;
import com.atul.test_doubles_spy.BookService;

class SpyTest {

	@Test
	void spyTest() 
	{
		BookRepository bookRepository = new BookRepositorySpy();
		BookService bookService = new BookService(bookRepository);
		Book book = new Book("1","A", 1, LocalDate.now());
		bookService.saveBook(book);
		assertEquals(book,((BookRepositorySpy)bookRepository).getLastAddedBook(),()->"Book not added");
		book = new Book("2","B", 100, LocalDate.now());
		bookService.saveBook(book);
		assertEquals(book,((BookRepositorySpy)bookRepository).getLastAddedBook(),()->"Book not added");
		assertEquals(2,((BookRepositorySpy)bookRepository).getSaveCount(),()->"All books not added");
	}

}
