package ru.belogurow;

import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/">2859. Sum of Values at Indices With K Set Bits</a>
 */
public class Solution2859 {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (numHasBits(i, k)) {
                sum += nums.get(i);
            }
        }

        return sum;
    }

    private boolean numHasBits(int num, int target) {
        int count = 0;

        while (num > 0) {
            num &= num - 1;
            count++;
            if (count > target) {
                return false;
            }
        }

        return count == target;
    }
}
