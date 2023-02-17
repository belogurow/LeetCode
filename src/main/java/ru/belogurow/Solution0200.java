package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/number-of-islands/">200. Number of Islands</a>
 */
public class Solution0200 {

	public int numIslands(char[][] grid) {
		int islandsNum = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					islandsNum += 1;
					dfs(grid, i, j);
				}
			}
		}

		return islandsNum;
	}

	private void dfs(char[][] grid, int i, int j) {
		if (!(0 <= i && i < grid.length && 0 <= j && j < grid[0].length)) {
			return;
		}

		if (grid[i][j] == '1') {
			grid[i][j] = '0';
		} else {
			return;
		}

		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);
	}
}
