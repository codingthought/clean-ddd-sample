package com.example.sample.application.job;

import com.example.sample.application.job.data.XMallOrderCreateForm;
import com.example.sample.domain.order.Order;
import com.example.sample.domain.order.OrderFactory;

public class XMallOrderFactory implements OrderFactory<XMallOrderCreateForm> {
    @Override
    public Order create(XMallOrderCreateForm xMallOrderCreateForm) {
        return null;
    }
}
