package com.example.sample.domain;

public interface Factory<T extends Entity<?>, Input> {
   T create(Input input);
}
