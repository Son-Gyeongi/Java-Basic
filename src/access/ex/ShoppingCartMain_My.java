package access.ex;

/*
규모가 있는 제대로된 문제
- 쇼핑 카트
 */
public class ShoppingCartMain_My {

    public static void main(String[] args) {
        ShoppingCart_My cart = new ShoppingCart_My();

        Item_My item1 = new Item_My("마늘", 2000, 2);
        Item_My item2 = new Item_My("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItem();
    }
}
