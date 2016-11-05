package com.wcy123;

import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import com.wcy123.parsec.impl.Pair;
import com.wcy123.parsec.impl.ParserResult;

public class ParsecTest {
    @Test
    public void main() {
        ImmutableList<Character> chars = Lists.charactersOf("hello");
        final Parsec<Pair<Pair<Pair<Pair<Character, Character>, Character>, Character>, Character>> hello = Parsec.item('h')
                .and(Parsec.item('e'))
                .and(Parsec.item('l'))
                .and(Parsec.item('l'))
                .and(Parsec.item('o'));
        final Iterable<ParserResult<Pair<Pair<Pair<Pair<Character, Character>, Character>, Character>, Character>>> results = hello
                .parse(chars);
        for (ParserResult<Pair<Pair<Pair<Pair<Character, Character>, Character>, Character>, Character>> p : results) {
            System.out.println(p.getValue());
            System.out.println(p.getRemain());
        }
    }
}
