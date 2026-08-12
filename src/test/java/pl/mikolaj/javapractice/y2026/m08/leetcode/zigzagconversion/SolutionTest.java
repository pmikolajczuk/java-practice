package pl.mikolaj.javapractice.y2026.m08.leetcode.zigzagconversion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void convertSingleRow() {
        Solution solution = new Solution();
        String result = solution.convert("HELLO", 1);
        assertEquals("HELLO", result);
    }

    @Test
    void convertTwoRows() {
        Solution solution = new Solution();
        String result = solution.convert("HELLO", 2);
        assertEquals("HLOEL", result);
    }

    @Test
    void convertThreeRows() {
        Solution solution = new Solution();
        String result = solution.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    void convertFourRows() {
        Solution solution = new Solution();
        String result = solution.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    void convertEmptyString() {
        Solution solution = new Solution();
        String result = solution.convert("", 3);
        assertEquals("", result);
    }

    @Test
    void convertSingleCharacter() {
        Solution solution = new Solution();
        String result = solution.convert("A", 3);
        assertEquals("A", result);
    }

    @Test
    void convertNumRowsGreaterThanStringLength() {
        Solution solution = new Solution();
        String result = solution.convert("HI", 5);
        assertEquals("HI", result);
    }
}
