package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/flood-fill/description/">733. Flood Fill</a>
 */
public class Solution0733 {

	int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		int prevColor = image[sr][sc];
		if (prevColor == color) {
			return image;
		}

		fill(image, sr, sc, color, prevColor);

		return image;
	}

	public void fill(int[][] image, int sr, int sc, int color, int prevColor) {
		if (image[sr][sc] == prevColor) {
			image[sr][sc] = color;
		} else {
			return;
		}

		for (int[] direction : directions) {
			int newSr = sr + direction[0];
			int newSc = sc + direction[1];

			if (0 <= newSr && newSr < image.length && 0 <= newSc && newSc < image[sr].length) {
				fill(image, newSr, newSc, color, prevColor);
			}
		}
	}
}
