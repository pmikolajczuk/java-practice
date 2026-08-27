package pl.mikolaj.javapractice.y2026.m08.leetcode.longestcommonprefix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefixWithCommonPrefix() {
        Solution solution = new Solution();
        String[] input = {"flower", "flow", "flight"};
        assertEquals("fl", solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefixWithNoCommonPrefix() {
        Solution solution = new Solution();
        String[] input = {"dog", "racecar", "car"};
        assertEquals("", solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefixWithSingleString() {
        Solution solution = new Solution();
        String[] input = {"single"};
        assertEquals("single", solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefixWithEmptyStrings() {
        Solution solution = new Solution();
        String[] input = {"", "b", "c"};
        assertEquals("", solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefixWithAllEmptyStrings() {
        Solution solution = new Solution();
        String[] input = {"", "", ""};
        assertEquals("", solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefixWithIdenticalStrings() {
        Solution solution = new Solution();
        String[] input = {"repeat", "repeat", "repeat"};
        assertEquals("repeat", solution.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefixWithMixedCaseStrings() {
        Solution solution = new Solution();
        String[] input = {"Case", "caseSensitive", "cases"};
        assertEquals("", solution.longestCommonPrefix(input));
    }
}