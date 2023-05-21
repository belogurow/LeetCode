package ru.belogurow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/merge-intervals/">56. Merge Intervals</a>
 */
public class Solution0056 {

  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

    List<int[]> res = new ArrayList<>();
    res.add(intervals[0]);

    for (int[] interval : intervals) {
      int[] resInterval = res.get(res.size() - 1);

      if (in(resInterval, interval[0]) || in(resInterval, interval[1])) {
        resInterval[0] = Math.min(interval[0], resInterval[0]);
        resInterval[1] = Math.max(interval[1], resInterval[1]);
      } else {
        res.add(interval);
      }
    }

    return res.toArray(new int[0][0]);
  }

  private boolean in(int[] interval, int num) {
    return interval[0] <= num && num <= interval[1];
  }
}
