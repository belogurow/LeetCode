package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/reshape-the-matrix/">566. Reshape the Matrix</a>
 */
public class Solution0566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];

        int matSize = mat[0].length, resSize = c;
        for (int i = 0, len = r * c; i < len; i++) {
            res[i / resSize][i % resSize] = mat[i / matSize][i % matSize];
        }

        return res;
    }
}
