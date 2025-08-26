package static2.ex;

// 수학 유틸리티 클래스
public class MathArrayUtils {

    // 첫번째 요구사항 - 인스턴스 생성 불가능
    private MathArrayUtils() {
        // private - 인스턴스 생성을 막는다.
    }

    // 배열의 모든 요소를 더하여 합계를 반환합니다.
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    // 배열의 모든 요소의 평균값을 계산합니다.
    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    // 배열에서 최소값을 찾습니다.
    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    // 배열에서 최대값을 찾습니다.
    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
