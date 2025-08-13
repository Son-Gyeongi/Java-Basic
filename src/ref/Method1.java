package ref;

/*
src/class1/ClassStart3.java
위 코드 중복은 메서드를 통해 손쉽게 제거할 수 있다.
 */
public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student(); // 참조값: x001
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student(); // 참조값: x002
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    // 초기화
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 출력
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age
                + " 성적: " + student.grade);
    }
}
