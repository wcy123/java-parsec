package com.wcy123.parsec.impl;

import lombok.Value;

@Value
public class ParserResult<T, P> {
    T value;
    P remain;
}
