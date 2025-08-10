package class1.ex;

// 상품 주문 시스템 개발
public class ProductOrderMain_My {

    public static void main(String[] args) {
        int sum = 0;
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder_My[] orders = new ProductOrder_My[2];

        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        ProductOrder_My order1 = new ProductOrder_My();
        order1.productName = "껌";
        order1.price = 1000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder_My order2 = new ProductOrder_My();
        order2.productName = "과자";
        order2.price = 2000;
        order2.quantity = 3;
        orders[1] = order2;

        // 상품 주문 정보와 최종 금액 출력
        for (ProductOrder_My order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price
                    + ", 수량: " + order.quantity);
            sum += (order.price * order.quantity);
        }

        System.out.println("총 결제 금액: " + sum);
    }
}
