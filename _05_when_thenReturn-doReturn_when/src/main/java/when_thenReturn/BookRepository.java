package when_thenReturn;
import java.util.List;

public interface BookRepository {
	List<Book> findLatestPublishedBooks(int days); 
	Book findBookById(String id);
}
