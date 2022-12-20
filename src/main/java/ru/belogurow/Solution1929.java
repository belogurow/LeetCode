package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/concatenation-of-array/">LeetCode 1929. Concatenation of Array</a>
 */
public class Solution1929 {

    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len * 2];

        for (int i = 0; i < len; i++) {
            ans[i] = nums[i];
            ans[len + i] = nums[i];
        }

        return ans;
    }
}
