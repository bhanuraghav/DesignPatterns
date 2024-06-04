package Aggregate;

import Collection.Book;
import Iterator.BookIterator;
import Iterator.IteratorInterface;

import java.util.List;

public class Library implements AggregateInterface{

    List<Book> bookList;

    public Library(List<Book> books){
        this.bookList = books;
    }

    @Override
    public IteratorInterface createIterator() {
        return new BookIterator(bookList);
    }
}
