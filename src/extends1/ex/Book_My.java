package extends1.ex;

public class Book_My extends Item_My {
    public String author;
    public String isbn;

    public Book_My(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
