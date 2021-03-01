package stub;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;

class StubTests
{
	@Test
	void stubTest() 
	{
		BookRepository bookRepository = mock(BookRepository.class);
		BookService bookService = new BookService(bookRepository);
		Collection<Book> bookList = new ArrayList();
		bookList.add(new Book("1","A",100,LocalDate.now()));
		bookList.add(new Book("2","B",200,LocalDate.now()));
		when(bookRepository.findNewBooks(10)).thenReturn(bookList);
		assertEquals(2,bookList.size());	
	}
}
