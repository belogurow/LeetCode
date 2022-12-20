package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/running-sum-of-1d-array/">LeetCode 1480. Running Sum of 1d Array</a>
 */
public class Solution1480 {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
