package pl.mikolaj.javapractice.y2026.m08.leetcode.longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1 || strs[j].charAt(i) != currentChar) {
                    return result.toString();
                }
            }
            result.append(currentChar);
        }
        return result.toString();
    }

    public String longestCommonPrefixV1(String[] strs) {
        String result = "";
        for (int i = 1; i <= strs[0].length(); i++) {
            String prefix = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) {
                    return result;
                }
            }
            result = prefix;
        }
        return result;
    }
}
