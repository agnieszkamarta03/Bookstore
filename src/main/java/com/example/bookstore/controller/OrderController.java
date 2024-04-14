package com.example.bookstore.controller;

import com.example.bookstore.entity.orderEntity.Orders;
import com.example.bookstore.order.OrderInfo;
import com.example.bookstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/list")
    private List<Orders> getOrdersByDate(){
        return orderService.getOrdersByDateASC();
    }

    @GetMapping("/{id}")
    private OrderInfo getFullOrderInfo(@PathVariable int id) throws Throwable {
        return orderService.findSpecificOrderAndFullInfo(id);
    }
}
