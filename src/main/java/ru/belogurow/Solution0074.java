package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a>
 */
public class Solution0074 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = searchRow(matrix, target);
        if (row == -1) {
            return false;
        }

        return searchCell(matrix[row], target);
    }

    private int searchRow(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length - 1]) {
                return mid;
            } else if (target < matrix[mid][0]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    private boolean searchCell(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
