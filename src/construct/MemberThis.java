package construct;

// this 생략
public class MemberThis {
    String nameField;

    // 필드와 매개변수 이름이 다를 경우
    void initMember(String nameParameter) {
        nameField = nameParameter; // 자동으로 this. 이 붙는다. this.nameField
    }
}
