package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/valid-sudoku/">36. Valid Sudoku</a>
 */
public class Solution0036 {

	public boolean isValidSudoku(char[][] board) {
		int rows = 9, cols = 9;
		for (int i = 0; i < rows; i++) {
			int[] countRow = new int[9];
			int[] countCol = new int[9];
			int[] countSquare = new int[9];

			for (int j = 0; j < cols; j++) {
				if (board[i][j] != '.') {
					if (countRow[board[i][j] - '1'] == 1) {
						return false;
					} else {
						countRow[board[i][j] - '1'] = 1;
					}
				}

				if (board[j][i] != '.') {
					if (countCol[board[j][i] - '1'] == 1) {
						return false;
					} else {
						countCol[board[j][i] - '1'] = 1;
					}
				}

				int m = (i / 3) * 3 + j / 3;
				int n = (i % 3) * 3 + j % 3;

				if (board[m][n] != '.') {
					if (countSquare[board[m][n] - '1'] == 1) {
						return false;
					} else {
						countSquare[board[m][n] - '1'] = 1;
					}
				}
			}
		}


		return true;
	}
}
