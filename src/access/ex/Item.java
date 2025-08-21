package access.ex;

/*
규모가 있는 제대로된 문제
- 쇼핑 카트
 */
public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    // 객체 지향적으로 내 데이터를 가지고 있는 클래스에 만든다.
    // 속성과 기능이 근처에 있는 것일 수록 좋다.
    public int getTotalPrice() {
        return price * quantity;
    }
}
