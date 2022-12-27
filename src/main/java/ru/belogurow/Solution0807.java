package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/max-increase-to-keep-city-skyline/">807. Max Increase to Keep City Skyline</a>
 */
public class Solution0807 {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;

        int[] maxInRows = getMaxInRows(grid, n);
        int[] maxInCols = getMaxInCols(grid, n);

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer += Math.min(maxInRows[i], maxInCols[j]) - grid[i][j];
            }
        }

        return answer;
    }

    private int[] getMaxInCols(int[][] grid, int n) {
        int[] maxInCols = new int[n];

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < n; j++) {
                int elem = grid[j][i];

                if (elem > max) {
                    max = elem;
                }
            }

            maxInCols[i] = max;
        }

        return maxInCols;
    }

    private int[] getMaxInRows(int[][] grid, int n) {
        int[] maxInRows = new int[n];

        for (int i = 0; i < n; i++) {
            int[] row = grid[i];
            int max = Integer.MIN_VALUE;

            for (int elem : row) {
                if (elem > max) {
                    max = elem;
                }
            }

            maxInRows[i] = max;
        }

        return maxInRows;
    }
}
