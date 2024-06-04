import Aggregate.Library;
import Collection.Book;
import Iterator.BookIterator;
import Iterator.IteratorInterface;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book(100,"abc"),
                new Book(200,"def"),
                new Book(300,"ghi"),
                new Book(400,"jkl")
        );

        Library lib = new Library(bookList);
        IteratorInterface iterator = lib.createIterator();

        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }


    }
}