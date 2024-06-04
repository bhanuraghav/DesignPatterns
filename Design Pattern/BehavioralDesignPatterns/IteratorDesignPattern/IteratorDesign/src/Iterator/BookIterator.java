package Iterator;
import Collection.Book;

import java.util.List;

public class BookIterator implements IteratorInterface {
    List<Book> books;
    int index = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }


    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Object next() {
       if(this.hasNext()){
           return books.get(index++);
       }
       return null;
    }
}
