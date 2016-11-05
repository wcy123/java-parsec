package com.wcy123.parsec.stage0;

import com.wcy123.parsec.impl.ParserResult;

import rx.functions.Func1;

public interface Parsec<T>
        extends Func1<Iterable<Character>, Iterable<ParserResult<T>>> {
    default Iterable<ParserResult<T>> parse(Iterable<Character> charIterator) {
        return this.call(charIterator);
    }
}
