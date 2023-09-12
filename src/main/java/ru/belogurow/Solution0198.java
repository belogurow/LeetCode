package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/house-robber">198. House Robber</a>
 */
public class Solution0198 {

    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }

        return prev1;
    }
}
