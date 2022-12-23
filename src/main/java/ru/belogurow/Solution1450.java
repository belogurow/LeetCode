package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/">1450. Number of Students Doing Homework at a Given Time</a>
 */
public class Solution1450 {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;

        for (int i = 0, len = startTime.length; i < len; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                res++;
            }
        }

        return res;
    }
}
