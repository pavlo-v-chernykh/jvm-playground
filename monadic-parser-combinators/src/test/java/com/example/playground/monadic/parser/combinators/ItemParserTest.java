package com.example.playground.monadic.parser.combinators;

import org.junit.Test;

import static com.example.playground.monadic.parser.combinators.ParserResult.parserResultList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemParserTest {
    @Test
    public void shouldParseOnlyOneItem() {
        final Parser parser = Parsers.item();

        assertThat(parser.parse("word"), is(equalTo(parserResultList("w", "ord"))));
        assertThat(parser.parse(""), is(equalTo(parserResultList())));
    }
}
