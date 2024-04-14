package com.example.bookstore.service;

import com.example.bookstore.entity.book.Book;
import com.example.bookstore.entity.orderEntity.Orders;
import com.example.bookstore.exception.BookNotFoundException;
import com.example.bookstore.order.OrderInfo;
import com.example.bookstore.order.PlaceOrder;
import com.example.bookstore.repository.BookRepository;
import com.example.bookstore.repository.OrderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    BookRepository bookRepository;
    OrderRepository orderRepository;

    @Autowired
    public OrderService(BookRepository bookRepository, OrderRepository orderRepository) {
        this.bookRepository = bookRepository;
        this.orderRepository = orderRepository;
    }

    private List<Orders> getOrdersByDateDESC(){
        return orderRepository.getOrdersByDateDesc();
    }


    private Integer getBookStock(int bookId) {
        return bookRepository.getBookStock(bookId);
    }

    private Orders createOrderEntity(PlaceOrder placeOrder, Book book) {
        Orders order = new Orders();
        BeanUtils.copyProperties(placeOrder, order);
        order.setDate(LocalDate.now());
        order.setBook(book);
        return order;
    }

    private OrderInfo createWithFullInfo(Orders order) throws Throwable {
        Optional result = bookRepository.findById(order.getBook().getId());
        Book book = (Book) result.orElseThrow(()->new BookNotFoundException("No such book"));
        OrderInfo fullOrderInfo = new OrderInfo();
        BeanUtils.copyProperties(order, fullOrderInfo);
        fullOrderInfo.setBookId(book.getId());
        fullOrderInfo.setTitle(book.getTitle());
        fullOrderInfo.setPrice(book.getPrice());
        fullOrderInfo.setImgUrl(book.getImgUrl());
        return fullOrderInfo;
    }

    public OrderInfo findSpecificOrderAndFullInfo(int orderId) throws Throwable {
        Optional<Orders> orderOptional = orderRepository.findById(orderId);
        Orders order = orderOptional.orElseThrow(() -> new IllegalArgumentException("Order not found"));

        OrderInfo fullOrderInfo = createWithFullInfo(order);
        return fullOrderInfo;
    }

    @Transactional
    public void createOrder(PlaceOrder placeOrder) {
        int bookId = placeOrder.getBookId();
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Furniture with id " + bookId + " not found"));
        int bookStock = getBookStock(bookId);
        if (bookStock <= 0)
            throw new IllegalArgumentException("This book is out of stock");
        Orders order = createOrderEntity(placeOrder, book);
        orderRepository.save(order);

    }


    @Transactional
    public void editOrder(int id, OrderInfo orderInfo) {
        Orders order = orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Order with id " + id + " not found"));
        BeanUtils.copyProperties(orderInfo, orderInfo);
    }

    @Transactional
    public void deleteOrder(int id) {
        Optional<Orders> result = orderRepository.findById(id);
        if(result.isPresent()){
            Orders order = result.get();
            orderRepository.delete(order);
        }
        else{
            throw new IllegalArgumentException("Wrong order");
        }

    }
}
