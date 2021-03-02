package behaviour;

import static org.mockito.Mockito.doNothing;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import main.Book;
import main.BookRepository;
import main.BookService;

@ExtendWith(MockitoExtension.class)
class VerifyOrderOfInvocation 
{
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	
	@Test
	void test() 
	{
		Book book = new Book("1","A","B",600,LocalDate.now());
		Mockito.when(bookRepository.findBookById("1")).thenReturn(book);
		doNothing().when(bookRepository).save(book);
		bookService.updatePrice("1",500);
		InOrder inOrder =  Mockito.inOrder(bookRepository);
		inOrder.verify(bookRepository).findBookById("1");
		inOrder.verify(bookRepository).save(book);		
	}

}
