package ref.ex;

import java.util.Scanner;

// 상품 주문 시스템 개발 - 사용자 입력
public class ProductOrderMain3_My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderCount = scanner.nextInt();
        scanner.nextLine(); // \n 해결
        ProductOrder[] orders = new ProductOrder[orderCount];

        int totalCount = 0;
        while (totalCount++ < orderCount) {
            System.out.println(totalCount + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int productPrice = scanner.nextInt();
            System.out.print("수량: ");
            int productQuantity = scanner.nextInt();
            scanner.nextLine(); // \n 해결

            ProductOrder order = new ProductOrder();
            orders[totalCount - 1] = createOrder(productName, productPrice, productQuantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    // ProductOrder 를 생성하고 매개변수로 초기값을 설정, ProductOrder 를 반환
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price
                    + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
