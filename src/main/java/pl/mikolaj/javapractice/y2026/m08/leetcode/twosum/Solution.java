package pl.mikolaj.javapractice.y2026.m08.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            int idxY = Arrays.binarySearch(sortedNums, y);

            if (idxY >= 0) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == y && j != i) {
                        return new int[] {i,j};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }
    public int[] twoSumCache2(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            Integer j = cache.get(y);
            if (j == null) {
                cache.put(nums[i], i);
            } else {
                return new int[]{j,i};
            }
        }
        return new int[]{-1,-1};
    }

    public int[] twoSumCache1(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            cache.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            Integer j = cache.get(y);
            if (j != null && i != j) {
                return new int[]{i,j};
            }

        }
        return new int[]{-1,-1};
    }

    public int[] twoSumNaive(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
