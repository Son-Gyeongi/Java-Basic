package extends1.ex;

/*
상속 관계 상품
- 쇼핑몰의 판매 상품을 만들어보자
 */
public class Item {

    // 공통 속성
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
    }
}
