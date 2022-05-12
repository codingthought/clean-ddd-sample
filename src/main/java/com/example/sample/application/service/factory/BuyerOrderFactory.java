package com.example.sample.application.service.factory;

import com.example.sample.contract.data.BuyerOrderCreateForm;
import com.example.sample.domain.order.Order;
import com.example.sample.domain.order.OrderFactory;

public class BuyerOrderFactory implements OrderFactory<BuyerOrderCreateForm> {

    @Override
    public Order create(BuyerOrderCreateForm createRequest) {
        return null;
    }
}
