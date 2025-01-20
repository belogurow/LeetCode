package ru.belogurow;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/first-completely-painted-row-or-column/">2661. First Completely Painted Row or Column</a>
 */
public class Solution2661 {

	public int firstCompleteIndex(int[] arr, int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;

		Map<Integer, int[]> matMap = new HashMap<>(); // (value, {i, j})
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matMap.put(mat[i][j], new int[] {i, j});
			}
		}

		int[] paintedRows = new int[m];
		int[] paintedCols = new int[n];

		for (int k = 0; k < arr.length; k++) {
			int[] cell = matMap.get(arr[k]);
			int i = cell[0];
			int j = cell[1];

			paintedRows[i] += 1;
			paintedCols[j] += 1;

			if (paintedRows[i] == n || paintedCols[j] == m) {
				return k;
			}
		}

		return -1;
	}
}
