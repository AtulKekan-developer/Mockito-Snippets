package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import when_thenReturn.Book;
import when_thenReturn.BookRepository;
import when_thenReturn.BookService;

@ExtendWith(MockitoExtension.class)
public class BookTest {

	@InjectMocks
	BookService bookService;

	@Mock
	BookRepository bookRepository;

	@Test
	public void test() {
		List<String> ids = new ArrayList();
		//ids.add("1");
		ids.add("1");
		ids.add("2");
		ids.add("3");
		ids.add("4");		
		when(bookRepository.findBookById("1")).thenReturn(new Book("1", "A", "B", LocalDate.now(), 100));
		when(bookRepository.findBookById("2")).thenReturn(new Book("2", "C", "D", LocalDate.now(), 200));
		doReturn(new Book("3", "E", "F", LocalDate.now(), 300)).when(bookRepository).findBookById("3");
		doReturn(new Book("4", "G", "H", LocalDate.now(), 400)).when(bookRepository).findBookById("4");		 
		//stubbing same input twice if id -> 1 is passed twice
		/*
		 * when(bookRepository.findBookById("1")).thenReturn(new Book("1", "A", "B",
		 * LocalDate.now(), 100), new Book("2", "C", "D", LocalDate.now(), 200));
		 */
		//or
		 when(bookRepository.findBookById("1")).thenReturn(new Book("1", "A", "B",LocalDate.now(),1000))
		 										.thenReturn(new Book("1", "A", "B",LocalDate.now(),1000));
		double totalCost = bookService.getTotalBookCost(ids);
		assertEquals(1000.0,totalCost);
		//assertEquals(300.0, totalCost);
	}
}
