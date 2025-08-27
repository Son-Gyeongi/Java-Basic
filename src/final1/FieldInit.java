package final1;

// final - 필드(멤버 변수)
public class FieldInit {

    /*
    static final 을 쓰면 대문자로 쓴다. - 상수
     */
    static final int CONST_VALUE = 10;
    final int value = 10; // 초기값 미리 주어진다.

    // 이미 할당된 value의 경우 생성자로 못 바꾼다.
    /*public FieldInit(int value) {
        this.value = value;
    }*/
}
