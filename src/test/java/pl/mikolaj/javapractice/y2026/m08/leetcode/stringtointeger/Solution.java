package pl.mikolaj.javapractice.y2026.m08.leetcode.stringtointeger;

public class Solution {
    public int myAtoi(String s) {
        int result = 0;
        int sign = 1;
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int nextDigit = charToInt(s.charAt(i));

            if (sign == -1) {
                if (result < (Integer.MIN_VALUE + nextDigit) / 10) {
                    return Integer.MIN_VALUE;
                }
            } else if (result > (Integer.MAX_VALUE - nextDigit) / 10) {
                return Integer.MAX_VALUE;
            }

            result = result * 10 + (nextDigit * sign);
            i++;
        }

        return result;
    }

    private int charToInt(char c) {
        return c - '0';
    }

    public int myAtoiChatGPT(String s) {
        int result = 0;
        int i = 0;

        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }

        boolean negative = false;

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            negative = s.charAt(i) == '-';
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result < (Integer.MIN_VALUE + digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 - digit;
            i++;
        }

        if (!negative && result == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }

        return negative ? result : -result;
    }
}
