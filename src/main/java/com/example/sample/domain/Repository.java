package com.example.sample.domain;

import java.util.Optional;

public interface Repository<T extends Aggregation<Identity>, Identity> {

    void store(T agg);

    default T save(T agg) {
        store(agg);
        return findBy(agg.getIdentity()).get();
    }

    Optional<T> findBy(Identity identity);

}
