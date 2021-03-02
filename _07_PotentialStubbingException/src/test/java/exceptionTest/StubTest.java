package exceptionTest;

import static org.mockito.Mockito.doNothing;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import main.Book;
import main.BookRepository;
import main.BookRequest;
import main.BookService;

@ExtendWith(MockitoExtension.class)
class StubTest {

	@InjectMocks
	BookService bookService;
	
	@Mock
	BookRepository bookRepository;
	
	@Test
	void testStub() {
		BookRequest bookRequest = new BookRequest("1","A","B",LocalDate.now(),750);
		Book book = new Book("1","A","B",LocalDate.now(),750);		
		doNothing().when(bookRepository).saveBook(book);
		bookService.addBook(bookRequest);//inside addBook we make call to saveBook that is stubbed above
		/*
		  saveBook is stubbed with book object but inside addBook saveBook will be
		  called using a new book object ,as mockito uses equals method to compare
		  stubbed and passed object for reference in this case the matching of objects
		  will fail and lead to exception , both objects need to match
		  
*/		 	
	}

}
