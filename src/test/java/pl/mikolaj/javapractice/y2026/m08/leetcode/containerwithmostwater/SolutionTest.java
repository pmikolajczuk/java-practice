package pl.mikolaj.javapractice.y2026.m08.leetcode.containerwithmostwater;

class SolutionTest {
    @org.junit.jupiter.api.Test
    void returnsZeroWhenHeightArrayIsEmpty() {
        Solution solution = new Solution();
        int[] height = {};
        org.junit.jupiter.api.Assertions.assertEquals(0, solution.maxArea(height));
    }

    @org.junit.jupiter.api.Test
    void returnsZeroWhenHeightArrayHasOneElement() {
        Solution solution = new Solution();
        int[] height = {5};
        org.junit.jupiter.api.Assertions.assertEquals(0, solution.maxArea(height));
    }

    @org.junit.jupiter.api.Test
    void calculatesMaxAreaForTwoElements() {
        Solution solution = new Solution();
        int[] height = {1, 2};
        org.junit.jupiter.api.Assertions.assertEquals(1, solution.maxArea(height));
    }

    @org.junit.jupiter.api.Test
    void calculatesMaxAreaForMultipleElements() {
        Solution solution = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        org.junit.jupiter.api.Assertions.assertEquals(49, solution.maxArea(height));
    }

    @org.junit.jupiter.api.Test
    void calculatesMaxAreaWhenAllHeightsAreEqual() {
        Solution solution = new Solution();
        int[] height = {5, 5, 5, 5};
        org.junit.jupiter.api.Assertions.assertEquals(15, solution.maxArea(height));
    }

    @org.junit.jupiter.api.Test
    void calculatesMaxAreaWhenHeightsAreDecreasing() {
        Solution solution = new Solution();
        int[] height = {9, 7, 5, 3, 1};
        org.junit.jupiter.api.Assertions.assertEquals(10, solution.maxArea(height));
    }
}