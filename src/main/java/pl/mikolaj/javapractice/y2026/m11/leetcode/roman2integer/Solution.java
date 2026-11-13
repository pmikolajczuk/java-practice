package pl.mikolaj.javapractice.y2026.m11.leetcode.roman2integer;

import java.util.List;
import java.util.Map;

class Solution {
    private final Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int result = 0;
        int previous = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map.getOrDefault(s.charAt(i), 0);
            if (current < previous) {
                result -= current;
            } else {
                result += current;
            }
            previous = current;
        }

        return result;
    }

    public int romanToIntV2(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        int previous = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            int current = map.get(chars[i]);
            if (current < previous) {
                result -= current;
            } else{
                result += current;
            }
            previous = current;
        }
        return result;
    }


    private final Map<Character, List<Character>> prefixes = Map.of(
            'I', List.of('V', 'X'),
            'X', List.of('L', 'C'),
            'C', List.of('D', 'M')
    );

    public int romanToIntV1(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length - 1) {
            if (prefixes.containsKey(chars[i]) && prefixes.get(chars[i]).contains(chars[i+1])) {
                result += -map.get(chars[i]) + map.get(chars[i+1]);
                i += 2;
            } else {
                result += map.get(chars[i]);
                i++;
            }
        }
        if (i < chars.length) {
            result += map.get(chars[i]);
        }
        return result;
    }
}