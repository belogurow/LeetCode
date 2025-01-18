package ru.belogurow;

import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid">1368. Minimum Cost to Make at Least One Valid Path in a Grid</a>
 */
public class Solution1368 {

    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // right, left, down, up

    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] cost = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = Integer.MAX_VALUE;
            }
        }

        cost[0][0] = 0;

        PriorityQueue<int[]> deque = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        deque.offer(new int[]{0, 0, 0}); // {i, j, currentCost}

        while (!deque.isEmpty()) {
            int[] cell = deque.poll();
            int i = cell[0];
            int j = cell[1];
            int currentCost = cell[2];

            // Skip if we've found a better path to this cell
            if (cost[i][j] != currentCost) continue;

            for (int d = 0; d < 4; d++) {
                int nextI = i + directions[d][0];
                int nextJ = j + directions[d][1];
                int direction = d + 1;

                if (nextI >= 0 && nextJ >= 0 && nextI < m && nextJ < n) {
                    int newCost = currentCost + (grid[i][j] == direction ? 0 : 1);

                    if (newCost < cost[nextI][nextJ]) {
                        cost[nextI][nextJ] = newCost;
                        deque.offer(new int[]{nextI, nextJ, newCost});
                    }
                }
            }
        }

        return cost[m - 1][n - 1];
    }

}
