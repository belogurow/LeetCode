package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/target-sum/">494. Target Sum</a>
 */
public class Solution0494 {

    public int findTargetSumWays(int[] nums, int target) {
        return findSum(nums, target, 0, 0);
    }

    private int findSum(int[] nums, int target, int idx, int sum) {
        if (idx == nums.length) {
            if (sum == target) {
                return 1;
            }

            return 0;
        }

        int number = nums[idx];
        return findSum(nums, target, idx + 1, sum + number) + findSum(nums, target, idx + 1, sum - number);
    }
}
