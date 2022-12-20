package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/build-array-from-permutation/">LeetCode 1920. Build Array from Permutation</a>
 */
public class Solution1920 {

    // a = bq + r
    // q = len, b = nums[nums[i]] % q, nums[i] = r
    public int[] buildArray(int[] nums) {
        int q = nums.length;

        for (int i = 0; i < q; i++) {
            nums[i] = q * (nums[nums[i]] % q) + nums[i];
        }

        for (int i = 0; i < q; i++) {
            nums[i] = nums[i] / q;
        }

        return nums;
    }

    public int[] buildArray2(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
