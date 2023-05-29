package ru.belogurow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/equal-row-and-column-pairs">2352. Equal Row and Column Pairs</a>
 */
public class Solution2352 {

  public int equalPairs(int[][] grid) {
    int n = grid.length;
    Map<String, Integer> count = new HashMap<>();

    for (int[] row : grid) {
      count.compute(Arrays.toString(row), (k, v) -> (v == null) ? 1 : v + 1);
    }

    int res = 0;

    for (int i = 0; i < n; i++) {
      int[] col = new int[n];
      for (int j = 0; j < n; j++) {
        col[j] = grid[j][i];
      }

      res += count.getOrDefault(Arrays.toString(col), 0);
    }

    return res;
  }
}
