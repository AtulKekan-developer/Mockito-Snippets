package exception_testing;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;
import java.sql.SQLException;
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
public class NonVoidException
{
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepsitory;
	
	@Test
	public void test() throws SQLException 
	{
		Book book = new Book("1","A","B",100,LocalDate.now());
		when(bookRepsitory.findBookById("1")).thenThrow(SQLException.class);
		assertThrows(SQLException.class,()->bookService.updatePrice("1" ,100));		
	}
}
