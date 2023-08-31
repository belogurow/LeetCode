package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/container-with-most-water/">LeetCode link</a>
 */
public class Solution0011 {

    public int maxArea(int[] height) {
        int maxArea = -1;

        for (int left = 0, right = height.length - 1; left < right; ) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
