package construct.ex;

// Book과 생성자
public class BookMain_My {
    public static void main(String[] args) {
        // 기본 생성자 이용
        Book_My book1 = new Book_My();
        book1.displayInfo();

        // title과 author 만을 매개변수로 받는 생성자
        Book_My book2 = new Book_My("Hello Java", "Seo");
        book2.displayInfo();

        // 모든 필드를 매개변수로 받는 생성자
        Book_My book3 = new Book_My("JPA 프로그래밍", "kim", 700);
        book3.displayInfo();
    }
}
