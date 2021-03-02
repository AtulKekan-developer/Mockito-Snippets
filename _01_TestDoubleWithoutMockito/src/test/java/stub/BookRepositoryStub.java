package stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.atul.test_doubles_stub.Book;
import com.atul.test_doubles_stub.BookRepository;

public class BookRepositoryStub implements BookRepository
{
	@Override
	public Collection<Book> findNewBooks(int dayPublished) 
	{
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("1", "A", 100,LocalDate.now()));
		bookList.add(new Book("2", "B", 200,LocalDate.now()));
		return bookList;
	}
}
