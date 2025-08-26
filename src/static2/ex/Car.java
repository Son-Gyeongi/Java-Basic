package static2.ex;

public class Car {
    private static int totalCars; // 차량 수 누적
    private String name;

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        // 구매한 차량 수를 출력하는 static메서드
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
