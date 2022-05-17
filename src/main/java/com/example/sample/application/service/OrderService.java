package com.example.sample.application.service;

import com.example.sample.application.service.factory.BuyerOrderFactory;
import com.example.sample.contract.data.BuyerOrderCreateForm;
import com.example.sample.contract.data.OrderInfo;
import com.example.sample.domain.order.Order;
import com.example.sample.domain.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final BuyerOrderFactory buyerOrderFactory;
    private final OrderRepository orderRepository;

    public OrderInfo createBuyerOrder(BuyerOrderCreateForm form) {
        Order order = buyerOrderFactory.create(form);
        order.store(orderRepository::store);
        // 第二种写法: orderRepository.store(order);
        // todo convert Oder to OrderInfo
//        order.map(
        return null;
    }
}
