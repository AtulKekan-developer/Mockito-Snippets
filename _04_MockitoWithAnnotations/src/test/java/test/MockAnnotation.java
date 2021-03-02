package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import support.Book;
import support.BookRepository;
import support.BookService;

@ExtendWith(MockitoExtension.class)
class MockAnnotation 
{
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	@Test
	void mockTest() 
	{		
		List<Book> bookList = new ArrayList();
		bookList.add(new Book(1,"A","B",LocalDate.now(),100));
		bookList.add(new Book(2,"C","D",LocalDate.now(),200));
		when(bookRepository.findLatestPublishedBooks(5)).thenReturn(bookList);
		
		
		assertEquals(2,bookService.findNewBooksWithAppliedDiscount(5,30).size());
		verify(bookRepository).findLatestPublishedBooks(5);
		
	}

}
