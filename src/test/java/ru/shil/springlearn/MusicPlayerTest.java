package ru.shil.springlearn;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MusicPlayerTest {

    @ParameterizedTest
    @CsvSource(value = {
            "some, 2",
            "some, 3",
            "some, 11"
    })
    void testParams(String str,int num){
        assertTrue(str.length()>3,"Str length <= 3");
        assertTrue(num>10,"Num <= 10");
    }



}