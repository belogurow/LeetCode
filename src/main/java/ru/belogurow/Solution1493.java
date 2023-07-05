package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/">1493. Longest Subarray of 1's After Deleting One Element</a>
 */
public class Solution1493 {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int prev = 0, current = 0;

        for (int num : nums) {
            if (num == 1) {
                current++;
            } else {
                res = Math.max(res, prev + current);
                prev = current;
                current = 0;
            }
        }

        res = Math.max(res, prev + current);

        return res == nums.length ? res - 1 : res;
    }
}
