package extends1.overriding;

// 상속 - 기능 추가와 클래스 확장
public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
