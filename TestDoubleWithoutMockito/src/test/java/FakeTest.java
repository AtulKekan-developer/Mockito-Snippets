import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import com.atul.test_doubles_fake.Book;
import com.atul.test_doubles_fake.BookRepository;
import com.atul.test_doubles_fake.BookRepositoryImpl;
import com.atul.test_doubles_fake.BookService;

class FakeTest {

	@Test
	void testIfAdded() 
	{
		BookRepository bookRepository = new BookRepositoryImpl();
		BookService bookService = new BookService(bookRepository);
		
		bookService.addBook(new Book("1","A",100,LocalDate.now()));
		bookService.addBook(new Book("2","B",200,LocalDate.now()));
		
		assertEquals(2,bookService.findNumberOfBooks());
	}

}
