package main;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository 
{
	List<Book> findAll();
	void save(Book book) throws SQLException;
	Book findBookById(String bookId) throws SQLException;
}
