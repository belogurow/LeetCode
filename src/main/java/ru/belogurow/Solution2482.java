package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/">2482. Difference Between Ones and Zeros in Row and Column</a>
 */
public class Solution2482 {

    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] diff = new int[m][n];

        int[] onesRow = new int[m];
        int[] onesCol = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                onesRow[i] += grid[i][j];
                onesCol[j] += grid[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = 2 * onesRow[i] + 2 * onesCol[j] - m - n;
            }
        }

        return diff;
    }
}
