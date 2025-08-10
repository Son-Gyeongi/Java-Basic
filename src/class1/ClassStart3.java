package class1;

// 클래스 도입
public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; // 학생을 담을 수 있는 변수 선언
        student1 = new Student(); // 학생을 실제 메모리에 만든다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        /*
        1. Student 객체 생성
        2. new Student()의 결과로 x002 참조값 변환
        3. 최종 결과 student2 = x002;
         */
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 참조값 확인
        // 패키지.클래스정보@16진수참조값 - 경로@참조값
        System.out.println(student1); // class1.Student@2f4d3709
        System.out.println(student2); // class1.Student@4e50df2e

        System.out.println("이름:" + student1.name + " 나이:" + student1.age
                + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age
                + " 성적:" + student2.grade);
    }
}
