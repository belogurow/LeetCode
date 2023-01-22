package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/check-if-it-is-a-straight-line/">1232. Check If It Is a Straight Line</a>
 */
public class Solution1232 {

    public boolean checkStraightLine(int[][] coordinates) {
        for (int i = 2; i < coordinates.length; i++) {
            if (!onLine(coordinates[0], coordinates[1], coordinates[i])) {
                return false;
            }
        }

        return true;
    }

    private boolean onLine(int[] p1, int[] p2, int[] p3) {
        return (p3[1] - p1[1]) * (p2[0] - p1[0]) == (p3[0] - p1[0]) * (p2[1] - p1[1]);
    }
}
