package extends1.ex;

/*
상속 관계 상품
- 쇼핑몰의 판매 상품을 만들어보자
 */
public class Item_My {
    public String name;
    public int price;

    public Item_My(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
    }

    public int getPrice() {
        return price;
    }
}
