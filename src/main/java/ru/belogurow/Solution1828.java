package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/">1828. Queries on Number of Points Inside a Circle</a>
 */
public class Solution1828 {

    public int[] countPoints(int[][] points, int[][] queries) {
        int queryLen = queries.length;
        int[] result = new int[queryLen];

        for (int i = 0; i < queryLen; i++) {
            queries[i][2] *= queries[i][2]; // r^2

            for (int[] currentPoint : points) {
                if (insideCircle(currentPoint, queries[i])) {
                    result[i]++;
                }
            }
        }

        return result;
    }

    private boolean insideCircle(int[] point, int[] circle) {
        return (Math.pow(point[0] - circle[0], 2) + Math.pow(point[1] - circle[1], 2)) <= circle[2];
    }
}
