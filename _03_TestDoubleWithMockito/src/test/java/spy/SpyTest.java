package spy;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SpyTest 
{
	@Test
	void spyTest() {
		BookRepository bookRepository = spy(BookRepository.class);
		BookService bookService = new BookService(bookRepository);
		
		Book book1 = new Book("1","A",100,LocalDate.now());
		bookService.saveBook(book1);
		Book book2 = new Book("2","B",200,LocalDate.now());
		bookService.saveBook(book2);
		
		verify(bookRepository,Mockito.times(1)).saveBook(book1);
		verify(bookRepository,Mockito.times(1)).saveBook(book2);
	}
}
