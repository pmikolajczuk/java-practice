package pl.mikolaj.javapractice.y2026.m08.leetcode.threesum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSumCopilot(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for the first number
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++; // Skip duplicates for the second number
                    while (left < right && nums[right] == nums[right - 1]) right--; // Skip duplicates for the third number
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            Set<Integer> cache = new HashSet<>();
            for (int j = i + 1 ; j < nums.length; j++) {
                int y = nums[j];
                if (cache.contains(-x -y)) {
                    List<Integer> triplet = new ArrayList<>(List.of(x, y, -x -y));
                    Collections.sort(triplet);
                    resultSet.add(triplet);
                } else {
                    cache.add(y);
                }
            }
        }
        return new ArrayList<>(resultSet);
    }

    public List<List<Integer>> threeSumV2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            Set<Integer> cache = new HashSet<>();
            for (int j = i + 1 ; j < nums.length; j++) {
                int y = nums[j];
                if (cache.contains(-x -y)) {
                    List<Integer> triplet = new ArrayList<>(List.of(x, y, -x -y));
                    Collections.sort(triplet);
                    if (!result.contains(triplet)) {
                        result.add(triplet);
                    }
                } else {
                    cache.add(y);
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSumV1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1 ; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(triplet);
                        if (!contains(result, triplet)) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }

    @SuppressWarnings("all")
    private boolean contains(List<List<Integer>> multiList, List<Integer> list) {
        for (List<Integer> l : multiList) {
            if (l.equals(list)) {
                return true;
            }
        }
        return false;
    }
}