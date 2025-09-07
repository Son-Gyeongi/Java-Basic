package poly.ex4;

// 순수 추상 클래스 - 모든 메서드가 추상 메서드이다.
public abstract class AbstractAnimal {

    // 추상 메서드 - 불완전한 메서드, 자식이 오버라이딩 해야함
    public abstract void sound();
    public abstract void move();
}
