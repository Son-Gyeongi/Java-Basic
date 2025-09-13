package poly.ex.pay1;

/*
결제 시스템 개발
- 2가지 결제 수단 -> 5개의 걸제 수단 추가로 지원
- 새로운 결제 수단을 쉽게 추가할 수 있도록, 기존 코드를 리팩토링
- 클라이언트 변경사항이 없어야 한다.
 */
public class PayMain1 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao 결제
        String payOption1 = "kakao";
         int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        // naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        // 잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        // 새로운 결제 수단 선택
        String payOption4 = "new";
        int amount4 = 10000;
        payService.processPay(payOption4, amount4);
    }
}
