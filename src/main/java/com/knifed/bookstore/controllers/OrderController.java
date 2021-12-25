package com.knifed.bookstore.controllers;

import com.knifed.bookstore.entities.Order;
import com.knifed.bookstore.repositories.OrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @GetMapping("/orders")
    public List<Order> getOrders(){
        return this.orderRepository.getOrderList();
    }

    @PostMapping("/orders")
    public void addOrder(@RequestBody Order order){
        System.out.println(order.getBook().getName());
        System.out.println(order.getUser());
        System.out.println("Here");
        this.orderRepository.addOrder(order);
    }
}
