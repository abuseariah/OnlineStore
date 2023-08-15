package com.example.onlinestore.services;

import com.example.onlinestore.models.Order;
import com.example.onlinestore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void saveProduct(Order order) {
        orderRepository.save(order);
    }

    public Order getOrderId(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAllProducts() {
        return orderRepository.findAll();
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
