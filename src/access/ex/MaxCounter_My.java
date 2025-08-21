package access.ex;

/*
최대 카운터와 캡슐화
최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공
 */
public class MaxCounter_My {
    private int count; // 내부에서 사용하는 숫자, 초기값은 0
    private int max; // 최대값, 생성자를 통해 입력

    public MaxCounter_My(int max) {
        this.max = max;
    }

    // 숫자를 하나 증가
    public void increment() {
        if (count + 1 <= max) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}
