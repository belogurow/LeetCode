package ru.belogurow;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @see <a href="https://leetcode.com/problems/non-overlapping-intervals/">435. Non-overlapping Intervals</a>
 */
public class Solution0435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int overlapping = 0;
        int[] prevInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (prevInterval[1] > intervals[i][0]) {
                overlapping++;
            } else {
                prevInterval[1] = intervals[i][1];
            }
        }

        return overlapping;
    }
}
