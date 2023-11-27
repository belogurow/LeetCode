package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/description/">2639. Find the Width of Columns of a Grid</a>
 */
public class Solution2639 {

	public int[] findColumnWidth(int[][] grid) {
		final int M = grid.length;
		final int N = grid[0].length;

		int[] result = new int[N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				result[j] = Math.max(result[j], getLength(grid[i][j]));
			}
		}

		return result;
	}

	private int getLength(int val) {
		int length = 0;

		if (val <= 0) {
			length += 1;
		}

		while (val != 0) {
			val /= 10;
			length += 1;
		}

		return length;
	}
}
