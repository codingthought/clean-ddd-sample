package com.example.sample.domain.order;

import com.example.sample.domain.Aggregation;
import com.example.sample.domain.Entity;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Builder
public class Order implements Aggregation<Order.OrderNo> {

    private final OrderNo orderNo;
    private final BigDecimal totalPrice;
    private final List<OrderItem> items;


    @Override
    public OrderNo getIdentity() {
        return orderNo;
    }


    @Getter
    @Builder
    static class OrderItem implements Entity<Integer> {
        private Integer id;
        private String name;
        private Integer quantity;
        private BigDecimal price;

        @Override
        public Integer getIdentity() {
            return id;
        }
    }

    public record OrderNo (String no) {
    }
}
