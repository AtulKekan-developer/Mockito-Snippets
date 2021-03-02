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
class VerifyAnInteractionHasNotOccured 
{
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	@Test
	void test() 
	{
		BookRequest bookRequest = new BookRequest("1","A","B",100,LocalDate.now());
		Book book = new Book("2","A","B",100,LocalDate.now());		
		bookService.addBook(bookRequest);
		//doNothing().when(bookRepository).save(book); -> commented because it never gets called as both books are different
		verify(bookRepository,Mockito.never()).save(book);
	}

}
