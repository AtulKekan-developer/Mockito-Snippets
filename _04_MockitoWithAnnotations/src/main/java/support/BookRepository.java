package support;

import java.util.List;

public interface BookRepository {
	List<Book> findLatestPublishedBooks(int days); 
}
