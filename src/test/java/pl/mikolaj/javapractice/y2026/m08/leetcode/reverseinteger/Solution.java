package pl.mikolaj.javapractice.y2026.m08.leetcode.reverseinteger;

public class Solution {
    public int reverse(int x) {
        int y = 0;
        while (x != 0) {
            //y = y * 10 + x % 10;
            try{
                y = Math.addExact(Math.multiplyExact(y, 10), x % 10);
            } catch (ArithmeticException e) {
                return 0;
            }
            x = x / 10;
        }
        return y;
    }

    public int reverseV2(int x) {
        boolean negative = x < 0;
        x = Math.abs(x);
        int y = 0;
        while (x > 0) {
            //y = y * 10 + x % 10;
            try{
                y = Math.addExact(Math.multiplyExact(y, 10), x % 10);
            } catch (ArithmeticException e) {
                return 0;
            }
            x = x / 10;
        }
        y = negative ? y * -1 : y;
        return y;
    }

    public int reverseV1(int x) {
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder(str);
        if (sb.charAt(0) == '-') {
            sb.delete(0, 1);
            sb.append('-');
        }
        String reversedStr = sb.reverse().toString();

        try {
            return Integer.parseInt(reversedStr);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}