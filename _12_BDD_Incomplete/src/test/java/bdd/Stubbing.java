package bdd;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import main.Book;
import main.BookManager;
import main.BookService;

@ExtendWith(MockitoExtension.class)
class Stubbing 
{	
	@InjectMocks
	private BookManager bookManager;
	
	@Spy
	private BookService bookService;
	
	@Test
	void test_Given_NewBooks_When_GetNewBooksWithAppliedDiscountIsCalled_Then_NewBooksWithAppliedDiscountIsReturned() 
	{
		//Given - Arrange
		Book book = new Book("1","A","B",500,LocalDate.now());
		given(bookService.findBook("1")).willReturn(book);
		//When - Act
		int discountPrice = bookManager.applyDiscountOnBook("1",25);
		//Then - Assert
		//then(bookService).
	}
}
