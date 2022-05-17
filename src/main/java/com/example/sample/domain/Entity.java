package com.example.sample.domain;

import java.util.function.Function;

public interface Entity<Identity> {
    Identity getIdentity();

    default <T extends Entity<Identity>, R> R map(Function<T, R> function) {
        return function.apply((T) this);
    }
}
