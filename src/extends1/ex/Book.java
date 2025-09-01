package extends1.ex;

public class Book extends Item {

    // 개별 속성
    private String author;
    private String isbn; // 책 찾는 번호

    public Book(String name, int price, String author, String isbn) {
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
