package ru.belogurow;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/trapping-rain-water-ii">407. Trapping Rain Water II</a>
 */
public class Solution0407 {

    int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;

        boolean[][] visited = new boolean[m][n];

        // {i, j, height}
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        // add boundary cells to the queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == m - 1) || (j == 0 || j == n - 1)) {
                    queue.offer(new int[]{i, j, heightMap[i][j]});
                    visited[i][j] = true;
                }
            }
        }

        int result = 0;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int i = cell[0];
            int j = cell[1];
            int height = cell[2];

            // check neighbors
            for (int d = 0; d < 4; d++) {
                int nextI = i + directions[d][0];
                int nextJ = j + directions[d][1];

                if (nextI >= 0 && nextJ >= 0 && nextI < m && nextJ < n) {
                    if (visited[nextI][nextJ]) {
                        // skip visited cells
                        continue;
                    }

                    result += Math.max(0, height - heightMap[nextI][nextJ]);
                    queue.add(new int[]{nextI, nextJ, Math.max(height, heightMap[nextI][nextJ])});
                    visited[nextI][nextJ] = true;
                }
            }
        }

        return result;
    }
}
