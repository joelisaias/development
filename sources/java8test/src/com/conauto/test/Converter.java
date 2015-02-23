package com.conauto.test;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
