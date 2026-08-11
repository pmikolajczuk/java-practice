package pl.mikolaj.javapractice.y2026.m08.leetcode.twosum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum_shouldReturnIndicesForValidPair() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @Test
    void twoSum_shouldReturnIndicesForAnotherValidPair() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, target));
    }

    @Test
    void twoSum_shouldReturnNegativeOneForNoValidPair() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int target = 7;
        assertArrayEquals(new int[]{-1, -1}, solution.twoSum(nums, target));
    }

    @Test
    void twoSum_shouldHandleEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        int target = 5;
        assertArrayEquals(new int[]{-1, -1}, solution.twoSum(nums, target));
    }

    @Test
    void twoSum_shouldHandleSingleElementArray() {
        Solution solution = new Solution();
        int[] nums = {5};
        int target = 5;
        assertArrayEquals(new int[]{-1, -1}, solution.twoSum(nums, target));
    }

    @Test
    void twoSum_shouldHandleNegativeNumbers() {
        Solution solution = new Solution();
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        assertArrayEquals(new int[]{0, 2}, solution.twoSum(nums, target));
    }

    @Test
    void twoSum_shouldHandleDuplicates() {
        Solution solution = new Solution();
        int[] nums = {3, 3};
        int target = 6;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }
}
