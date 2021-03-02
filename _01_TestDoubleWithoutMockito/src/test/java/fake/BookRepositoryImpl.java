package fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.atul.test_doubles_fake.Book;
import com.atul.test_doubles_fake.BookRepository;

public class BookRepositoryImpl implements BookRepository
{
	Map<String,Book> bookStore = new HashMap();

	@Override
	public void save(Book book) {
		bookStore.put(book.getBookId(),book);
	}

	@Override
	public Collection<Book> findAll() {
		return bookStore.values();
	}

}
