package poly.basic;

/*
다운캐스팅과 반대로 현재 타입을 부모 타입으로 변경하는 것을 업캐스팅이라 한다.
 */
// upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        // 부모는 자식을 담을 수 있다.
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅은 생략 가능, 생략 권장
        Parent parent2 = child; // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
