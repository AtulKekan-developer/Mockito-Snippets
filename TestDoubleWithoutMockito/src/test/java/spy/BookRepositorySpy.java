package spy;

import com.atul.test_doubles_spy.Book;
import com.atul.test_doubles_spy.BookRepository;

public class BookRepositorySpy implements BookRepository 
{
	int saveCount = 0;
	Book lastAddedBook = null;
	
	@Override
	public void saveBook(Book book) {
		saveCount++;
		lastAddedBook = book;
	}

	public int getSaveCount() {
		return saveCount;
	}

	public Book getLastAddedBook() {
		return lastAddedBook;
	}

}
