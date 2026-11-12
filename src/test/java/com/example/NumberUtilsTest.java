
package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @ParameterizedTest
    @CsvSource({
        "2, true",
        "3, true",
        "7, true",
        "1, false",
        "0, false",
        "-5, false",
        "10, false"
    })
    void testPrime(long n, boolean expected) {
        assertEquals(expected, NumberUtils.isPrime(n));
    }

    @ParameterizedTest
    @CsvSource({
        "121, true",
        "1331, true",
        "0, true",
        "123, false",
        "10, false",
        "-121, false"
    })
    void testPalindrome(long n, boolean expected) {
        assertEquals(expected, NumberUtils.isPalindrome(n));
    }

    @ParameterizedTest
    @CsvSource({
        "2, true",
        "0, true",
        "-2, true",
        "10, true",
        "3, false",
        "-7, false"
    })
    void testEven(long n, boolean expected) {
        assertEquals(expected, NumberUtils.isEven(n));
    }

    @ParameterizedTest
    @CsvSource({
        "1, true",
        "3, true",
        "-7, true",
        "0, false",
        "2, false",
        "-10, false"
    })
    void testOdd(long n, boolean expected) {
        assertEquals(expected, NumberUtils.isOdd(n));
    }
}
