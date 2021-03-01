package dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DummyTest 
{
	@Test
	void dummyTest()
	{
		BookRepository bookRepository = mock(BookRepository.class);
		EmailService emailService = mock(EmailService.class);
		BookService bookService = new BookService(bookRepository,emailService);
		
		List<Book> bookList = new ArrayList();
		bookList.add(new Book("1","A",100,LocalDate.now()));
		bookList.add(new Book("2","B",200,LocalDate.now()));
		
		when(bookRepository.findAll()).thenReturn(bookList);
		
		assertEquals(2,bookService.findNumberOfBooks());
	}
}
