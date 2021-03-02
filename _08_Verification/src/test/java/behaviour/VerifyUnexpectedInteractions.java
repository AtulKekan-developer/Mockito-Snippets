package behaviour;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
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
class VerifyUnexpectedInteractions 
{
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	@Test
	void test() 
	{
		Book book = new Book("1","A","B",600,LocalDate.now());
		when(bookRepository.findBookById("1")).thenReturn(book);		
		bookService.updatePriceVer("1",500);
		verify(bookRepository).findBookById("1");
		verifyNoMoreInteractions(bookRepository);
	}

}
