package com.wcy123.parsec.impl;

import lombok.Value;

@Value
public class Pair<T, R> {
    T fst;
    R snd;

    public static <T, R> Pair<T, R> makePair(T fst, R snd) {
        return new Pair(fst, snd);
    }
}
