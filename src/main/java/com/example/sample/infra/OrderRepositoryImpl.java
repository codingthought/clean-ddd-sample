package com.example.sample.infra;

import com.example.sample.domain.order.Order;
import com.example.sample.domain.order.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public void store(Order order) {

    }

    @Override
    public Optional<Order> findBy(Order.OrderNo orderNo) {
        return Optional.empty();
    }
}
