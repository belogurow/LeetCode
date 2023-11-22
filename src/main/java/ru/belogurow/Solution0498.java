package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/diagonal-traverse/">498. Diagonal Traverse</a>
 */
public class Solution0498 {

    public int[] findDiagonalOrder(int[][] mat) {
        final int N = mat.length;
        final int M = mat[0].length;

        int[] result = new int[N * M];

        boolean up = true;

        for (int i = 0, j = 0, k = 0; i < result.length; i++) {
            result[i] = mat[j][k];

            if (up) {
                if (k == M - 1) {
                    // down
                    j++;
                    up = false;
                } else if (j == 0) {
                    // right
                    k++;
                    up = false;
                } else {
                    j--;
                    k++;
                }
            } else {
                if (j == N - 1) {
                    // right
                    k++;
                    up = true;
                } else if (k == 0) {
                    // down
                    j++;
                    up = true;
                } else {
                    j++;
                    k--;
                }
            }
        }

        return result;
    }

}
