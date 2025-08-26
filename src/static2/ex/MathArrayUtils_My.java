package static2.ex;

// 수학 유틸리티 클래스
public class MathArrayUtils_My {

    private MathArrayUtils_My() {
    }

    // 배열의 모든 요소를 더하여 합계를 반환합니다.
    public static int sum(int[] array) {
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }
        return totalSum;
    }

    // 배열의 모든 요소의 평균값을 계산합니다.
    public static double average(int[] array) {
        return sum(array) / (double) array.length;
    }

    // 배열에서 최소값을 찾습니다.
    public static int min(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    // 배열에서 최대값을 찾습니다.
    public static int max(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
