package final1.ex;

/*
final은 매우 유용한 제약이다.
 */
public class Member {

    private final String id; // final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // id는 final로 바꿀 수 없다.
    public void changeData(String id, String name) {
        // this.id = id; // 컴파일 오류
        this.name = name;
    }

    public void print() {
        System.out.println("id:" + id + ", name:" + name);
    }
}
