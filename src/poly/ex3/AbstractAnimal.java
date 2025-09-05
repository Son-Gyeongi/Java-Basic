package poly.ex3;

// 추상 클래스 - 제약이 추가된 클래스
public abstract class AbstractAnimal {

    // 추상 메서드 - 불완전한 메서드, 자식이 오버라이딩 해야함
    public abstract void sound();

    // 자식에게 상속 목적
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
