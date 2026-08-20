package pl.mikolaj.javapractice.y2026.m08.leetcode.longestsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstringReturnsZeroForEmptyString() {
        Solution solution = new Solution();
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void lengthOfLongestSubstringReturnsOneForSingleCharacterString() {
        Solution solution = new Solution();
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    void lengthOfLongestSubstringHandlesStringWithAllUniqueCharacters() {
        Solution solution = new Solution();
        assertEquals(6, solution.lengthOfLongestSubstring("abcdef"));
    }

    @Test
    void lengthOfLongestSubstringHandlesStringWithRepeatingCharacters() {
        Solution solution = new Solution();
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void lengthOfLongestSubstringHandlesStringWithAllSameCharacters() {
        Solution solution = new Solution();
        assertEquals(1, solution.lengthOfLongestSubstring("aaaaa"));
    }

    @Test
    void lengthOfLongestSubstringHandlesStringWithSpecialCharacters() {
        Solution solution = new Solution();
        assertEquals(4, solution.lengthOfLongestSubstring("a!@#a"));
    }

    @Test
    void lengthOfLongestSubstringHandlesStringWithMixedCaseCharacters() {
        Solution solution = new Solution();
        assertEquals(6, solution.lengthOfLongestSubstring("aAbBcC"));
    }

    @Test
    void lengthOfLongestSubstringHandlesLeetCodeExample3() {
        Solution solution = new Solution();
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
}
