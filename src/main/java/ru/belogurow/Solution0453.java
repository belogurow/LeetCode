package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-equal-array-elements/">453. Minimum Moves to Equal Array Elements</a>
 */
public class Solution0453 {

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int moves = 0;

        for (int num : nums) {
            min = Math.min(num, min);
        }

        for (int num : nums) {
            moves += Math.abs(num - min);
        }

        return moves;
    }
}
