package Patika_3_Week.ProjeKitap.service;

import Patika_3_Week.ProjeKitap.User;
import Patika_3_Week.ProjeKitap.model.Order;
import Patika_3_Week.ProjeKitap.model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private static final List<Order> orderList = new ArrayList<>();

    public void create(List<Product> productList, User user) {
        Order order = new Order(productList, user);
        orderList.add(order);

    }

    public void list() {
        for (Order order : orderList) {
            System.out.println(order);
        }
    }
}
