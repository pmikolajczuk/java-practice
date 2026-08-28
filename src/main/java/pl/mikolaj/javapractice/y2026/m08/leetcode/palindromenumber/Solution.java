package pl.mikolaj.javapractice.y2026.m08.leetcode.palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        return x >= 0 && x == reverse(x);
    }

    private long reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result;
    }

    public boolean isPalindromeV1(int x) {
        String xStr = String.valueOf(x);
        for (int i = 0, j = xStr.length() - 1; i < j; i++, j--) {
            if (xStr.charAt(i) != xStr.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
