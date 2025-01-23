package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/count-servers-that-communicate/">1267. Count Servers that Communicate</a>
 */
public class Solution1267 {

    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rows = new int[m];
        int[] cols = new int[n];

        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    if (rows[i] > 1 || cols[j] > 1) {
                        result += 1;
                    }
                }
            }
        }

        return result;
    }
}
