package com.wcy123;

import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import com.wcy123.parsec.impl.Pair;

public class ParsecTest {
    @Test
    public void main() {
        ImmutableList<Character> chars = Lists.charactersOf("hello");
        final Parsec<Character> parsec = Parsec.item('d');
        final Iterable<Pair<Character, Iterable<Character>>> xx = parsec.parse(chars);
        for (Pair<Character, Iterable<Character>> p : xx) {
            System.out.println(p.getValue());
            System.out.println(p.getRemain());
        }
    }
}
