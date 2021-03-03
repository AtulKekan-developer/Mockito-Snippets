package argumentcaptor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.sql.SQLException;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import main.Book;
import main.BookRepository;
import main.BookRequest;
import main.BookService;

@ExtendWith(MockitoExtension.class)
class ArgumentTest 
{
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	@Test
	void test() throws SQLException {
		BookRequest bookRequest = new BookRequest("1","A","B",500, LocalDate.now());
		ArgumentCaptor<Book> bookArgumentCaptor = ArgumentCaptor.forClass(Book.class);
		bookService.addBookUsingRequest(bookRequest);
		verify(bookRepository).save(bookArgumentCaptor.capture());
		//will capture the book class object passed in save method inside bookService.addBookUsingRequest(bookRequest)	
		//alternative to equals method
		Book book = bookArgumentCaptor.getValue();
		assertEquals(bookRequest.getId(), book.getId());
	}

}
