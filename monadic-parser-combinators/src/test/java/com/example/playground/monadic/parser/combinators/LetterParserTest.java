package com.example.playground.monadic.parser.combinators;

import org.junit.Test;

import static com.example.playground.monadic.parser.combinators.ParserResult.parserResultList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LetterParserTest {
    @Test
    public void shouldParserLowerCaseOrUpperCaseItem() {
        Parser parser = Parsers.letter();

        assertThat(parser.parse("world"), is(equalTo(parserResultList("w", "orld"))));
        assertThat(parser.parse("World"), is(equalTo(parserResultList("W", "orld"))));
        assertThat(parser.parse(""), is(equalTo(parserResultList())));
    }
}
