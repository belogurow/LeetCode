package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/grid-game/description/">2017. Grid Game</a>
 */
public class Solution2017 {

    public long gridGame(int[][] grid) {
        int n = grid[0].length;

        long[] prefixSum = new long[n];
        long[] suffixSum = new long[n];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + grid[1][i - 1];
            suffixSum[n - 1 - i] = suffixSum[n - i] + grid[0][n - i];
        }

        long result = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            result = Math.min(result, Math.max(prefixSum[i], suffixSum[i]));
        }

        return result;
    }
}
