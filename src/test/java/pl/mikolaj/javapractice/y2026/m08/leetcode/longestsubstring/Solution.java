package pl.mikolaj.javapractice.y2026.m08.leetcode.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> chars = new HashSet<>();
        for(int i = 0, j = 0; j < s.length();) {
            if (chars.add(s.charAt(j))) {
                j++;
            } else {
                maxLength = Math.max(maxLength, chars.size());
                chars.remove(s.charAt(i));
                i++;
            }
        }
        maxLength = Math.max(maxLength, chars.size());

        return maxLength;
    }

    public int lengthOfLongestSubstringV2(String s) {
        int maxLength = 0;

        for(int start = 0; start < s.length(); start++) {
            for(int end = start + maxLength + 1; end <= s.length(); end++) {
                int currentLength = end - start;
                if(isValid(s, start, end)) {
                    maxLength = Math.max(maxLength, currentLength);
                } else {
                    break;
                }
            }
        }
        return maxLength;
    }

    private boolean isValid(String s, int start, int end) {
        Set<Character> chars = new HashSet<>();
        for(int i = start; i < end; i++) {
            if (!chars.add(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public int lengthOfLongestSubstringV1(String s) {
        int longestSubstringLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> charsInSubstring = new HashSet<>();
            int substringLength = 0;
            for (int j = i; j < s.length(); j++) {
                Character c = s.charAt(j);
                if (charsInSubstring.add(c)) {
                    substringLength++;
                } else {
                    break;
                }
            }
            longestSubstringLength = Math.max(longestSubstringLength, substringLength);
        }
        return longestSubstringLength;
    }
}
