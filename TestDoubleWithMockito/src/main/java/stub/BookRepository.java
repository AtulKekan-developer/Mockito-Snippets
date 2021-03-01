package stub;

import java.util.Collection;

public interface BookRepository 
{
	public Collection<Book> findNewBooks(int daysPublishedBefore);
}
