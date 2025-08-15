package oop1;

/*
클래스와 메서드
- 자바와 같은 객체 지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 포함할 수 있다.
- 숫자를 증가시키는 기능도 클래스에 함께 포함해서 새로운 클래스 정의
 */
public class ValueObject {
    int value;

    void add() {
        value++;
        System.out.println("숫자 증가 value는=" + value);
    }
}
