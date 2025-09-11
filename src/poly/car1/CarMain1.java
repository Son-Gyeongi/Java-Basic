package poly.car1;

/*
다형성을 활용하면 역할과 구현을 분리해서,
클라이언트 코드의 변경 없이 구현 객체를 변경할 수 있다.
현재 관계에서는 Driver가 클라이언트이다.
 */
public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경(k3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경(model3 -> newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
