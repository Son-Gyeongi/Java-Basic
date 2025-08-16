package oop1.ex;

// 객체 지향 계좌
// 은행 계좌를 객체로 설계
public class Account {
    int balance; // 잔액

    // 입급 메서드
    void deposit(int amount) {
        // 임금시 잔액이 증가한다.
        balance += amount;
    }

    // 출금 메서드
    void withdraw(int amount) {
        // 출금시 잔액이 감소한다.
        // 만약 잔액이 부족하면 잔액 부족을 출력해야 한다.
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }

    void printAccount() {
        System.out.println("잔고: " + balance);
    }
}
