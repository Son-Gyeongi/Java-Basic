package construct;

// 생성자 도입
public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 - 생성자 오버로딩과 this()
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 변경: 자기 자신 메서드 호출
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
