package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/max-number-of-k-sum-pairs">LeetCode link</a>
 */
public class Solution1679 {
    public int maxOperations(int[] nums, int k) {
        int operations = 0;
        Arrays.sort(nums);

        for (int left = 0, right = nums.length - 1; left < right; ) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                operations++;
                left++;
                right--;
            } else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }

        return operations;
    }
}
