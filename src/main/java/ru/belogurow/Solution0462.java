package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii">462. Minimum Moves to Equal Array Elements II</a>
 */
public class Solution0462 {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        final int median = nums.length % 2 != 0 ?
                nums[nums.length / 2] :
                (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2;

        int moves = 0;

        for (int num : nums) {
            moves += Math.abs(num - median);
        }

        return moves;
    }
}
