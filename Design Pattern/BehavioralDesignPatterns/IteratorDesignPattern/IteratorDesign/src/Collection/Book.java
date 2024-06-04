package Collection;

public class Book {
    int price;
    String bookName;

    public  Book(int price,String bookName){
        this.bookName= bookName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getBookName() {
        return bookName;
    }
}
