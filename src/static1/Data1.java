package static1;

// 특정 클래스를 통해서 생성된 객체의 수를 세는 단순한 프로그램
public class Data1 {
    // 예제를 단순하게 설명하기 위해 public 사용해서 직접 접근
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;
    }
}
