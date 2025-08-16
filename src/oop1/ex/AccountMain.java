package oop1.ex;

// 객체 지향 계좌
public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        // 계좌에 10,000원을 입금
        account.deposit(10_000);
        // 계좌에서 9,000원을 출금
        account.withdraw(9_000);
        // 계좌에서 2,000원을 출금
        account.withdraw(2_000); // 오류 메시지 출력
        // 잔고를 출력
        System.out.println("잔고: " + account.balance);
    }
}
