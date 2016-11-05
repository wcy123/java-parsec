package com.wcy123.parsec.stage0;

import static com.wcy123.parsec.impl.ParserResult.makeResult;

import java.util.Collections;

import org.junit.Test;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import com.wcy123.parsec.impl.ParserResult;

public class ParsecTest {
    @Test
    public void main() {
        Parsec<Integer> intParser = ss -> {
            StringBuilder bs = new StringBuilder();
            int n = 0;
            for (Character s : ss) {
                if (s >= '0' && s <= '9') {
                    bs.append(s);
                    n = n + 1;
                } else {
                    break;
                }
            }
            if (n == 0) {
                return Collections.emptyList();
            }
            return Collections
                    .singleton(makeResult(Integer.parseInt(bs.toString()), Iterables.skip(ss, n)));
        };

        final Iterable<ParserResult<Integer>> result =
                intParser.parse(Lists.charactersOf("12hello"));
        System.out.println(result);
    }
}
