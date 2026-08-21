package pl.mikolaj.javapractice.y2026.m08.leetcode.longestpalindromicsubstring;

public class Solution {
    public String longestPalindrome(String s) {
        int longestStart = 0;
        int longestEnd = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            //handle Odd Length Palindrome
            int[] expandResult = expandFromCenter(s, i, i);
            int start = expandResult[0], end = expandResult[1];
            if (end - start > longestEnd - longestStart) {
                longestStart = start;
                longestEnd = end;
            }

            //handle Even Length Palindrome
            expandResult = expandFromCenter(s, i, i + 1);
            start = expandResult[0];
            end = expandResult[1];
            if (end - start > longestEnd - longestStart) {
                longestStart = start;
                longestEnd = end;
            }
        }

        return s.substring(longestStart, longestEnd + 1);
    }

    private int[] expandFromCenter(String s, int start, int end) {
        int[] result = {-1, -1};
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            result[0] = start;
            result[1] = end;

            start--;
            end++;
        }
        return result;
    }

    public String longestPalindromeV3(String s) {
        String longestPalindrome = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 1; i - j >= 0 && i + j < s.length(); j++) {
                if (s.charAt(i-j) == s.charAt(i+j)) {
                    if (j * 2 + 1 > longestPalindrome.length()) {
                        longestPalindrome = s.substring(i - j, i + j + 1);
                    }
                } else {
                    break;
                }
            }

            for (int j = 0; i - j >= 0 && i + j + 1 < s.length(); j++) {
                if (s.charAt(i - j) == s.charAt(i + j + 1)) {
                    if (j * 2 + 2 > longestPalindrome.length()) {
                        longestPalindrome = s.substring(i - j, i + j + 2);
                    }
                } else {
                    break;
                }
            }
        }

        return longestPalindrome;
    }

    public String longestPalindromeV2(String s) {
        String longestPalindrome = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + longestPalindrome.length() - 1; j < s.length();) {
                char firstChar = s.charAt(i);
                j = s.indexOf(firstChar, j + 1);
                if (j >= 0) {
                    String substring = s.substring(i, j + 1);
                    if (isPalindromeV2(substring)) {
                        longestPalindrome = substring;
                    }
                } else {
                    break;
                }
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindromeV2(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindromeV1(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + longestPalindrome.length(); j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (isPalindromeV1(substring) && (substring.length() > longestPalindrome.length())) {
                    longestPalindrome = substring;
                }
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindromeV1(String s) {
        String reversed = (new StringBuilder(s)).reverse().toString();
        return s.equals(reversed);
    }
}
