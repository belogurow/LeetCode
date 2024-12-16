package ru.belogurow;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/">3264. Final Array State After K Multiplication Operations I</a>
 */
public class Solution3264 {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            int idx = findMinNumIdx(nums);
            nums[idx] *= multiplier;
            k--;
        }

        return nums;
    }

    private int findMinNumIdx(int[] nums) {
        int minIdx = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }
        }

        return minIdx;
    }
}
