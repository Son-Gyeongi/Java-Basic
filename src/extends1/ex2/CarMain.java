package extends1.ex2;

/*
상속은 객체 지향 프로그래밍의 핵심 요소 중 하나
상속을 사용하려면 extends 키워드를 사용하면 된다.
extends 대상은 하나만 선택 가능
 */
public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
