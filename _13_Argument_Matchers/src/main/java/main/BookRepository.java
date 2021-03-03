package main;

import java.util.List;

public interface BookRepository 
{
	public void save(Book book);
	public Book findBookById(String id);
	public List<Book> findAll();	
}
