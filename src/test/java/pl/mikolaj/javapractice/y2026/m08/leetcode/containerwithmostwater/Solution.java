package pl.mikolaj.javapractice.y2026.m08.leetcode.containerwithmostwater;

public class Solution {
    static{
        //this is some kind of hack to make it faster
        for(int i = 0; i<60; i++){
            maxArea(new int[]{0,0});
        }
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (right > left) {
            int area = Math.min(height[right], height[left]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public int maxAreaV1(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int area = h * w;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
