package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a>
 */
public class Solution0074 {

	public boolean searchMatrix(int[][] matrix, int target) {
		int n = matrix[0].length;

		for (int[] row : matrix) {
			if (target < row[0]) {
				return false;
			}

			if (target <= row[n - 1]) {
				return searchInRow(row, target);
			}
		}

		return false;
	}

	private boolean searchInRow(int[] row, int target) {
		for (int j : row) {
			if (j == target) {
				return true;
			}
		}

		return false;
	}
}
