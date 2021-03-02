package test;

import static org.mockito.Mockito.doNothing;

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
class VoidTest 
{
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	@Test
	void voidTest() {
		Book book  = new Book("1","A","B",LocalDate.now(),100);
		doNothing().when(bookRepository).save(book);
		bookRepository.save(book);
	}

}
