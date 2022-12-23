package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/minimum-time-visiting-all-points/">1266. Minimum Time Visiting All Points</a>
 */
public class Solution1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int sec = 0;
        for (int i = 1, len = points.length; i < len; i++) {
            int[] next = points[i];
            int[] current = points[i - 1];

            sec += Math.max(Math.abs(next[0] - current[0]), Math.abs(next[1] - current[1]));
        }


        return sec;
    }
}
