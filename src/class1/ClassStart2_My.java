package class1;

// 문제: ClassStart1 문제에 배열을 사용하자
public class ClassStart2_My {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentScores = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentScores[i]);
        }
    }
}
