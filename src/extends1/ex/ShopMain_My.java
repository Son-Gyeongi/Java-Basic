package extends1.ex;

/*
상속 관계 상품
- 쇼핑몰의 판매 상품을 만들어보자
 */
public class ShopMain_My {

    public static void main(String[] args) {
        Book_My bookMy = new Book_My("JAVA", 10000, "han", "12345");
        Album_My albumMy = new Album_My("앨범1", 15000, "seo");
        Movie_My movieMy = new Movie_My("영화1", 18000, "감독1", "배우1");


        bookMy.print();
        albumMy.print();
        movieMy.print();

        int sum = bookMy.getPrice() + albumMy.getPrice() + movieMy.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
