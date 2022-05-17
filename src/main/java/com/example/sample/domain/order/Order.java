package com.example.sample.domain.order;

import com.example.sample.domain.Aggregation;
import com.example.sample.domain.Entity;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Builder
public class Order implements Aggregation<Order.OrderNo> {

    private final OrderNo orderNo;
    private final Status status;
    private final List<OrderItem> items;
    private final List<String> couponCodes;
    private BigDecimal totalPrice;


    @Override
    public OrderNo getIdentity() {
        return orderNo;
    }


    @Getter
    @Builder
    static class OrderItem implements Entity<Integer> {
        private Integer id;
        private String name;
        private String skuCode;
        private List<String> couponCodes;
        private Integer quantity;
        private BigDecimal price;

        @Override
        public Integer getIdentity() {
            return id;
        }
    }

    public record OrderNo (String no) {
    }

    public Order calculateTotalPrice(TotalPriceCalculator totalPriceCalculator) {
        totalPrice = totalPriceCalculator.calculate(List.copyOf(items), List.copyOf(couponCodes));
        return this;
    }

    public enum Status {
        UN_PAID("UN_PAID", "待支付"),
        PAID("PAID", "已支付"),
        COMPLETED("COMPLETED", "已完成");

        Status(String code, String name) {
        }
    }

    public interface TotalPriceCalculator {

        BigDecimal calculate(List<OrderItem> items, List<String> orderCouponCodes);
    }
}
