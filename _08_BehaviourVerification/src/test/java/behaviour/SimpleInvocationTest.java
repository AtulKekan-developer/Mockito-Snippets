package behaviour;
import static org.mockito.Mockito.verify;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import main.Book;
import main.BookRepository;
import main.BookService;

@ExtendWith(MockitoExtension.class)
class SimpleInvocationTest 
{
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository; 

	@Test
	void simpleTest() 
	{
		Book book = new Book("1","A","B",100,LocalDate.now());		
		
		bookService.save(book);
		
		verify(bookRepository).save(book);
	}
}
