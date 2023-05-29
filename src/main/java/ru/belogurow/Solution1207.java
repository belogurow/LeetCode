package ru.belogurow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/unique-number-of-occurrences/">1207. Unique Number of Occurrences</a>
 */
public class Solution1207 {

  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> arrCount = new HashMap<>();

    for (int n : arr) {
      arrCount.compute(n, (k, v) -> (v == null) ? 1 : v + 1);
    }

    Set<Integer> occurences = new HashSet<>();
    for (Integer n : arrCount.values()) {
      if (!occurences.add(n)) {
        return false;
      }
    }

    return true;
  }
}
