package access.ex;

/*
최대 카운터와 캡슐화
최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공
 */
public class MaxCounter {
    private int count = 0;
    private int max;

    // 해당 클래스는 다른 패키지 안에서도 사용 가능
    public MaxCounter(int max) {
        this.max = max;
    }

    // 숫자를 하나 증가
    public void increment() {
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return; // 메서드 종료
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}
