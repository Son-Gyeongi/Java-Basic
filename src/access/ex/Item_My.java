package access.ex;

/*
규모가 있는 제대로된 문제
- 쇼핑 카트
 */
public class Item_My {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public Item_My(String itemName, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}
