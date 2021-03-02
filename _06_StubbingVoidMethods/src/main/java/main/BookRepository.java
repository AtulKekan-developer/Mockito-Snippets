package main;
import java.util.List;

public interface BookRepository {
	List<Book> findLatestPublishedBooks(int days); 
	Book findBookById(String id);
	void save(Book book);
}
