package dummy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import com.atul.test_doubles_dummy.Book;
import com.atul.test_doubles_dummy.BookRepository;
import com.atul.test_doubles_dummy.BookRepositoryImpl;
import com.atul.test_doubles_dummy.BookService;
import com.atul.test_doubles_dummy.EmailService;


class DummyTest 
{
	@Test
	void dummyTest()
	{
		BookRepository bookRepository = new BookRepositoryImpl();
		EmailService emailService = new DummyEmailService();
		BookService bookService = new BookService(bookRepository,emailService);
		
		bookService.addBook(new Book("1","A",100,LocalDate.now()));
		bookService.addBook(new Book("2","B",200,LocalDate.now()));
		
		assertEquals(2,bookService.findNumberOfBooks());
	}
}
