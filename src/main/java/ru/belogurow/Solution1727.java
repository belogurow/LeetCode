package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/largest-submatrix-with-rearrangements/">1727. Largest Submatrix With Rearrangements</a>
 */
public class Solution1727 {

	public int largestSubmatrix(int[][] matrix) {
		final int M = matrix.length;
		final int N = matrix[0].length;

		for (int row = 1; row < M; row++) {
			for (int col = 0; col < N; col++) {
				if (matrix[row][col] != 0) {
					matrix[row][col] += matrix[row - 1][col];
				}
			}
		}

		int result = 0;

        for (int[] curRow : matrix) {
            Arrays.sort(curRow);

            for (int i = N - 1; i >= 0; i--) {
                result = Math.max(result, curRow[i] * (N - i));
            }
        }

		return result;
	}
}
