package com.atul.test_doubles_stub;

import java.util.Collection;

public interface BookRepository 
{
	public Collection<Book> findNewBooks(int daysPublishedBefore);
}
