package com.wcy123.parsec.impl;

import lombok.Value;

@Value
public class Pair<T, P> {
    T value;
    P remain;
}
