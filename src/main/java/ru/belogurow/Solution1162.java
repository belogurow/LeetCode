package ru.belogurow;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.com/problems/as-far-from-land-as-possible/">1162. As Far from Land as Possible</a>
 * <p>
 * todo try dynamic programming
 */
public class Solution1162 {

	public int maxDistance(int[][] grid) {
		int n = grid.length;
		int[][] direction = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

		Deque<Pair> visitedCells = new ArrayDeque<>();
		Deque<Pair> newCells = new ArrayDeque<>(); // cells with 1

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					newCells.push(new Pair(i, j));
				}
			}
		}

		if (newCells.isEmpty() || newCells.size() == n * n) { // not found any 1 or all cells are 1
			return -1;
		}

		int count = 0;
		while (visitedCells.size() != n * n) {
			int size = newCells.size();
			int i = 0;
			while (i < size) {
				Pair cell = newCells.pop();

				for (int[] direct : direction) {
					int x = cell.i + direct[0];
					int y = cell.j + direct[1];

					if (0 <= x && 0 <= y && x < n && y < n && grid[x][y] == 0) {
						grid[x][y] = 1;
						newCells.add(new Pair(x, y));
					}
				}

				visitedCells.push(cell);
				i++;
			}

			count++;
		}

		return count - 1;
	}

	private record Pair(int i, int j) {
	}
}
