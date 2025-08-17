package construct.ex;

// Book과 생성자
public class Book_My {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    // 코드를 완성하세요.
    // 기본 생성자 이용
    public Book_My() {
        this("", "", 0);
    }

    // title과 author 만을 매개변수로 받는 생성자
    public Book_My(String title, String author) {
        this(title, author, 0);
    }

    // 모든 필드를 매개변수로 받는 생성자
    public Book_My(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
