package extends1.overriding;

/*
오버라이딩(Overriding)
- 부모에게서 상속 받은 기능을 자식이 재정의 하는 것
 */
public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
