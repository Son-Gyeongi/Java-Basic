package poly.ex.pay1;

// 핵심 클라이언트 PayService는 역할에만 의존한다.
// 변하지 않는 부분
public class PayService {

    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        // 결제 수단 쪼개기
        // OCP원칙 만족
        Pay pay = PayStore.findPay(option); // 결제 수단 선택하는 부분
        boolean result = pay.pay(amount); // 널오브젝트패턴, 코드상 null을 다룰 필요가 없다.
        /*if (pay != null) {
            result = pay.pay(amount); // 실제 결제하는 부분
        }*/

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
