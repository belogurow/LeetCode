package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/trapping-rain-water/">42. Trapping Rain Water</a>
 */
public class Solution0042 {

    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[n - 1] = height[n - 1];
        rightMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            rightMax[i] = Math.max(rightMax[i - 1], height[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            leftMax[i] = Math.max(leftMax[i + 1], height[i]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.max(0, Math.min(leftMax[i], rightMax[i]) - height[i]);
        }

        return result;
    }
}
