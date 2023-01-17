package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/">1779. Find Nearest Point That Has the Same X or Y Coordinate</a>
 */
public class Solution1779 {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int pointIdx = -1;
        int smallestManhattanDistance = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int pointManhattanDistance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (pointManhattanDistance < smallestManhattanDistance) {
                    smallestManhattanDistance = pointManhattanDistance;
                    pointIdx = i;
                }
            }
        }

        return pointIdx;
    }
}
