package static2.ex;

// 구매한 자동차 수
public class CarMain_My {

    public static void main(String[] args) {
        Car_My car1 = new Car_My("K3");
        Car_My car2 = new Car_My("G80");
        Car_My car3 = new Car_My("Model Y");

        Car_My.showTotalCars(); // 구매한 차량 수를 출력하는 static 메서드
    }
}
