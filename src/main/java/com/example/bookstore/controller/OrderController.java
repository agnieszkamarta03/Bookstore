package com.example.bookstore.controller;

import com.example.bookstore.entity.orderEntity.Orders;
import com.example.bookstore.order.OrderInfo;
import com.example.bookstore.order.PlaceOrder;
import com.example.bookstore.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/place")
    public Orders createOrder(@RequestBody PlaceOrder placeOrder) {
        return orderService.createOrder(placeOrder);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable int id){
        orderService.deleteOrder(id);
    }

    @PutMapping("/edit/{id}")
    public Orders editOrder(@PathVariable int id, @RequestBody OrderInfo orderInfo) {
        Orders order = orderService.findById(id);
        if (order == null) {
            throw new IllegalArgumentException("Order with id " + id + " not found");
        }
        BeanUtils.copyProperties(orderInfo, order);
        orderService.editOrder(id,orderInfo);

        return orderService.findById(id);

    }
}
