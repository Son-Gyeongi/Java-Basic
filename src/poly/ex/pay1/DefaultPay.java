package poly.ex.pay1;

/*
널오브젝트패턴 - null 대신에 객체 사용
결제 수단이 없는 것도 하나의 클래스로 만든다.
 */
public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
