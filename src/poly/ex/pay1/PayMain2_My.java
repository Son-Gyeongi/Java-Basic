package poly.ex.pay1;

import java.util.Scanner;

// 결제 시스템 개발 - 사용자 입력
public class PayMain2_My {

    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);
        String payOption = "";
        int amount = 0;

        while (true) {
            System.out.print("결제 수단을 입력하세요:");
            payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("결제 금액을 입력하세요:");
            amount = scanner.nextInt();
            scanner.nextLine();
            payService.processPay(payOption, amount);
        }
    }
}
