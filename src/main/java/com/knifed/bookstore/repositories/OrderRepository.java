package com.knifed.bookstore.repositories;

import com.knifed.bookstore.entities.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {

    private List<Order> orderList;

    public OrderRepository(List<Order> orderList){
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void addOrder(Order order){
        this.getOrderList().add(order);
    }
}
