package class1.ex;

// 영화 리뷰 관리하기1 - 프로그램 실행
public class MovieReviewMain_My {

    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview_My movie1 = new MovieReview_My();
        movie1.title = "봄날은 간다";
        movie1.review = "감명 깊어요.";

        MovieReview_My movie2 = new MovieReview_My();
        movie2.title = "전우치";
        movie2.review = "진짜 재밌어요";

        MovieReview_My[] movies = {movie1, movie2};

        // 영화 리뷰 정보 출력
        for (MovieReview_My movie : movies) {
            System.out.println("영화 제목: " + movie.title + ", 영화 리뷰: " + movie.review);
        }
    }
}
