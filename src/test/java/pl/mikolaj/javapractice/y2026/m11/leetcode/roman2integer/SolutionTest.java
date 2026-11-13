package pl.mikolaj.javapractice.y2026.m11.leetcode.roman2integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void romanToInt_shouldConvertSimpleRomanNumerals() {
        assertEquals(1, solution.romanToInt("I"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void romanToInt_shouldConvertComplexRomanNumerals() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
        assertEquals(2024, solution.romanToInt("MMXXIV"));
        assertEquals(444, solution.romanToInt("CDXLIV"));
        assertEquals(3888, solution.romanToInt("MMMDCCCLXXXVIII"));
    }

    @Test
    void romanToInt_shouldHandleSingleSymbolValues() {
        assertEquals(1000, solution.romanToInt("M"));
        assertEquals(50, solution.romanToInt("L"));
        assertEquals(5, solution.romanToInt("V"));
    }

    @Test
    void romanToInt_shouldHandleRepeatedSymbols() {
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(30, solution.romanToInt("XXX"));
        assertEquals(3000, solution.romanToInt("MMM"));
    }

    @Test
    void romanToInt_shouldReturnZeroForEmptyString() {
        assertEquals(0, solution.romanToInt(""));
    }
}

