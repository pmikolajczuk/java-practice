package pl.mikolaj.javapractice.y2026.m08.leetcode.stringtointeger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void convertsStringWithLeadingAndTrailingSpaces() {
        Solution solution = new Solution();
        assertEquals(123, solution.myAtoi("   123   "));
    }

    @Test
    void handlesStringWithOnlySpaces() {
        Solution solution = new Solution();
        assertEquals(0, solution.myAtoi("     "));
    }

    @Test
    void handlesStringWithNonDigitCharactersOnly() {
        Solution solution = new Solution();
        assertEquals(0, solution.myAtoi("abcd"));
    }

    @Test
    void handlesStringWithMixedDigitsAndNonDigits() {
        Solution solution = new Solution();
        assertEquals(123, solution.myAtoi("123abc"));
    }

    @Test
    void handlesStringWithMultipleSigns() {
        Solution solution = new Solution();
        assertEquals(0, solution.myAtoi("+-123"));
    }

    @Test
    void handlesStringWithDigitsExceedingIntegerRange() {
        Solution solution = new Solution();
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("9999999999"));
    }

    @Test
    void handlesStringWithNegativeDigitsExceedingIntegerRange() {
        Solution solution = new Solution();
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-9999999999"));
    }

    @Test
    void handlesTestCase1095() {
        Solution solution = new Solution();
        assertEquals(2147483646, solution.myAtoi("2147483646"));
    }

    @Test
    void handlesIntegerMaxValue() {
        Solution solution = new Solution();
        assertEquals(2147483647, solution.myAtoi("2147483647"));
    }

    @Test
    void handlesIntegerMinValue() {
        Solution solution = new Solution();
        assertEquals(-2147483648, solution.myAtoi("-2147483648"));
    }

    @Test
    void handlesEdgeCasePositiveOverflow() {
        Solution solution = new Solution();
        assertEquals(2147483647, solution.myAtoi("2147483648"));
    }
}