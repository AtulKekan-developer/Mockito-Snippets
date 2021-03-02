package mock;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.atul.test_doubles_mock.Book;
import com.atul.test_doubles_mock.BookRepository;

public class BookRepositoryMock implements BookRepository 
{
	int saveCount = 0;
	Book lastAddedBook = null;
	
	@Override
	public void saveBook(Book book) {
		saveCount++;
		lastAddedBook = book;
	}

	public void verify(Book book,int timesCalled)
	{
		assertEquals(book,lastAddedBook);
		assertEquals(timesCalled,saveCount);
	}

}
