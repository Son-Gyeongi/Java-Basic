package extends1.ex3;

/*
상위 개념 - 자동차
하위 개념 - 전기차, 가솔린차
 */
public class Car {

    public void move() {
        System.out.println("차를 이동합니다.");
    }

    // 기능 추가
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }

}
