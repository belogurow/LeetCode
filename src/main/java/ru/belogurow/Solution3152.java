package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/special-array-ii">3152. Special Array II</a>
 */
public class Solution3152 {

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] prefixSum = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1];

            if (nums[i - 1] % 2 == nums[i] % 2) {
                prefixSum[i]++;
            }
        }

        boolean[] res = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            res[i] = prefixSum[left] == prefixSum[right];
        }

        return res;
    }
}
