package class1.ex;

// 영화 리뷰 관리하기2 - 배열, for문 사용
public class MovieReviewMain2_My {

    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        MovieReview[] movies = {inception, aboutTime};

        // 영화 리뷰 정보 출력
        for (MovieReview movie : movies) {
            System.out.print("영화 제목: " + movie.title + ", 리뷰: " + movie.review);
            System.out.println();
        }
    }
}
