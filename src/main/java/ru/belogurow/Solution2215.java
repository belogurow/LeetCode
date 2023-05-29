package ru.belogurow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/">2215. Find the Difference of Two Arrays</a>
 */
public class Solution2215 {

  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    for (int i = 0, n = Math.max(nums1.length, nums2.length); i < n; i++) {
      if (i < nums1.length) {
        set1.add(nums1[i]);
      }

      if (i < nums2.length) {
        set2.add(nums2[i]);
      }
    }

    List<List<Integer>> res = List.of(new ArrayList<>(), new ArrayList<>());

    for (Integer n : set1) {
      if (!set2.contains(n)) {
        res.get(0).add(n);
      }
    }

    for (Integer n : set2) {
      if (!set1.contains(n)) {
        res.get(1).add(n);
      }
    }


    return res;
  }
}
