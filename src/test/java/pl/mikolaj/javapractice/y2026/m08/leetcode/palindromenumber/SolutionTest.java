package pl.mikolaj.javapractice.y2026.m08.leetcode.palindromenumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void returnsTrueForSingleDigitPalindrome() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isPalindrome(7));
    }

    @Test
    void returnsTrueForPositivePalindromeNumber() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isPalindrome(121));
    }

    @Test
    void returnsFalseForNonPalindromeNumber() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isPalindrome(123));
    }

    @Test
    void returnsFalseForNegativeNumber() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void returnsTrueForLargePalindromeNumber() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isPalindrome(123454321));
    }

    @Test
    void returnsFalseForLargeNonPalindromeNumber() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isPalindrome(123456789));
    }

    @Test
    void returnsTrueForZero() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isPalindrome(0));
    }
}