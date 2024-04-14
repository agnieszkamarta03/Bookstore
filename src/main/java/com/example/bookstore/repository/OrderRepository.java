package com.example.bookstore.repository;

import com.example.bookstore.entity.orderEntity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer> {


    @Query("SELECT o FROM Orders o ORDER BY o.date DESC")
    List<Orders> getOrdersByDateDesc();


}
