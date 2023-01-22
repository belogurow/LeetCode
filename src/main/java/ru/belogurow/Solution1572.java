package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/matrix-diagonal-sum/">1572. Matrix Diagonal Sum</a>
 */
public class Solution1572 {

    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0, len = mat.length; i < len; i++) {
            sum += mat[i][i];

            if (i == len - 1 - i) { // center
                continue;
            }

            sum += mat[i][len - 1 - i];
        }

        return sum;
    }
}
