package poly.basic;

/*
일시적으로 다운캐스팅을 해서 인스턴스에 있는
하위 클래스의 기능을 바로 호출할 수 있다.

업캐스팅은 생략 가능, 다운 캐스팅은 생략 불가능
 */
public class CastingMain2 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); // 참조값: x001
        // 단, 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        // poly.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
