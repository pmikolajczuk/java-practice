package pl.mikolaj.javapractice.y2026.m08.leetcode.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void reverse() {
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(120));
        assertEquals(0, solution.reverse(0));
        assertEquals(0, solution.reverse(1534236469)); // Overflow case
    }
}