package pl.mikolaj.javapractice.y2026.m08.leetcode.zigzagconversion;

public class Solution {
    public String convert(String s, int numRows) {
        int width;
        if (numRows == 1) {
            width = s.length();
        } else {
            int reminder = (s.length() % (numRows * 2 - 2));
            reminder = reminder > 0 ? Math.max(1, reminder - numRows + 1) : 0;
            width = (s.length() / (numRows * 2 - 2)) * (numRows - 1) + reminder;
        }

        char[][] zigzag = new char[numRows][width];
        char[] chars = s.toCharArray();

        int k = 0;
        for (int i = 0; i < chars.length;) {
            for (int j = 0; j < numRows && i < chars.length; j++,i++) {
                zigzag[j][k] = chars[i];
            }
            k++;
            for (int j = numRows - 2; j > 0 && i < chars.length; j--,i++,k++) {
                zigzag[j][k] = chars[i];
            }

        }

        StringBuilder result = new StringBuilder();
        for (char[] row : zigzag) {
            for (char c : row) {
                if (c != 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
