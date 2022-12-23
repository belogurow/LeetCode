package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/subrectangle-queries/">1476. Subrectangle Queries</a>
 */
public class Solution1476 {

    public static class SubrectangleQueries {

        private final int[][] rectangle;

        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    this.rectangle[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            return rectangle[row][col];
        }
    }
}
