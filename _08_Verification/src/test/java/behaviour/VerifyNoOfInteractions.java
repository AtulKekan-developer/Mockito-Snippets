package behaviour;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import main.Book;
import main.BookRepository;
import main.BookRequest;
import main.BookService;

@ExtendWith(MockitoExtension.class)
class VerifyNoOfInteractions 
{
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	@Test
	void test() 
	{
		BookRequest bookRequest = new BookRequest("1","A","B",100,LocalDate.now());
		Book book = new Book("1","A","B",100,LocalDate.now());
		doNothing().when(bookRepository).save(book);		
		bookService.addBook(bookRequest);
		verify(bookRepository).save(book);
		verify(bookRepository,Mockito.times(1)).save(book);
	}
}
