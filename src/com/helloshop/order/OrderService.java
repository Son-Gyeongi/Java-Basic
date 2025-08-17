package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

// 패키지 활용
//패키지 자체는 계층구조랑 아무 관계가 없다.
//서로 완전히 다르다.
public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
