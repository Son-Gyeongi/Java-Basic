package com.helloshop.order;

// 다른 패키지에 있는 걸 가져다 쓴다.
import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    // 생성자
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
