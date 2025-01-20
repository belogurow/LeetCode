package ru.belogurow;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/">2133. Check if Every Row and Column Contains All Numbers</a>
 */
public class Solution2133 {

    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> rowValues = new HashSet<>();
            Set<Integer> colValues = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (!rowValues.add(matrix[i][j])) {
                    return false;
                }

                if (!colValues.add(matrix[j][i])) {
                    return false;
                }
            }
        }

        return true;
    }
}
