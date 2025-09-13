package poly.ex.pay1;

// 결제 수단을 보관하고 관리
// 생성되지 않게 abstract 선언
public abstract class PayStore {

    // 문자에 따른 결제 수단을 찾아준다.
    // 변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
