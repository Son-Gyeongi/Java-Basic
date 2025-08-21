package access.ex;

import java.util.ArrayList;
import java.util.List;

/*
규모가 있는 제대로된 문제
- 쇼핑 카트
 */
public class ShoppingCart_My {
    private List<String> items = new ArrayList<>();
    private int totalPrice;

    public void addItem(Item_My item) {
        // 검증 로직
        if (items.size() >= 10) {
            System.out.println("더이상 장바구니에 추가할 수 없습니다.");
            return;
        }

        totalPrice += item.getItemPrice() * item.getItemQuantity();
        String itemStr = "상품명:" + item.getItemName() + ", 합계:" + totalPrice;
        items.add(itemStr);
    }

    public void displayItem() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
        System.out.println("전체 가격 합:" + totalPrice);
    }
}
