package ru.belogurow;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/map-of-highest-peak/">1765. Map of Highest Peak</a>
 */
public class Solution1765 {

    int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;

        boolean[][] visited = new boolean[m][n];
        int[][] result = new int[m][n];

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    visited[i][j] = true;
                    queue.offer(new int[]{i, j, 0});
                }
            }
        }


        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int i = cell[0];
            int j = cell[1];
            int curHeight = cell[2];
            result[i][j] = curHeight;

            for (int d = 0; d < 4; d++) {
                int nextI = i + directions[d][0];
                int nextJ = j + directions[d][1];

                if (nextI >= 0 && nextJ >= 0 && nextI < m && nextJ < n && !visited[nextI][nextJ]) {
                    visited[nextI][nextJ] = true;
                    queue.offer(new int[]{nextI, nextJ, curHeight + 1});
                }
            }
        }

        return result;
    }
}
