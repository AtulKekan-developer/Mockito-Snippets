package com.atul.test_doubles_dummy;

import java.util.Collection;

public interface BookRepository 
{
	void save(Book book);
	Collection<Book> findAll();
}
