package Patika_3_Week.ProjeKitap.model;

import Patika_3_Week.ProjeKitap.User;
import Patika_3_Week.ProjeKitap.model.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private List<Product> productList;
    private OrderStatus orderStatus;
    private final User user;
    private final LocalDateTime createdDate;
    private LocalDateTime canceledDate;
    private double total;


    public Order(List<Product> productList, User user) {
        this.productList = productList;
        this.user = user;
        this.orderStatus = OrderStatus.PREPARING;
        this.createdDate = LocalDateTime.now();
        this.canceledDate = null;

    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void cancelOrder(Order order) {
        order.setOrderStatus(OrderStatus.CANCELED);
        order.canceledDate = LocalDateTime.now();
    }

    public Double getTotal() {
        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                ", orderStatus=" + orderStatus +
                ", user=" + user +
                ", createdDate=" + createdDate +
                ", canceledDate=" + canceledDate +
                ", total=" + getTotal() +
                '}';
    }
}
