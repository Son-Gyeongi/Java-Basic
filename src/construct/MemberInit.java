package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가 - 초기값 설정 기능을 제공하는 메서드
    void initMember(String name, int age, int grade) {
        // this: 자기자신의 인스턴스 참조값
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
