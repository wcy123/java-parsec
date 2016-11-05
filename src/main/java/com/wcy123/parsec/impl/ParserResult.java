package com.wcy123.parsec.impl;

import lombok.Value;

@Value
public class ParserResult<T> {
    T value;
    Iterable<Character> remain;

    public static <T> ParserResult<T> makeResult(T value, Iterable<Character> remain) {
        return new ParserResult<T>(value, remain);
    }
}
