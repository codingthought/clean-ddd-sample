package com.example.sample.domain;

import java.util.function.Consumer;

public interface Aggregation<Identity> extends Entity<Identity> {
    default <T extends Aggregation<Identity>> void store(Consumer<T> consumer) {
        validate();
        consumer.accept((T) this);
    }

    default void validate() {
        // do nothing
    }
}
