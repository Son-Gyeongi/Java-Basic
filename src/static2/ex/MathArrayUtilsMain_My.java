package static2.ex;

// 수학 유틸리티 클래스
public class MathArrayUtilsMain_My {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + MathArrayUtils_My.sum(values));
        System.out.println("average=" + MathArrayUtils_My.average(values));
        System.out.println("min=" + MathArrayUtils_My.min(values));
        System.out.println("max=" + MathArrayUtils_My.max(values));
    }
}
