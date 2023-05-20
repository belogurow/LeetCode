package ru.belogurow;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/">2610. Convert an Array Into a 2D Array With Conditions</a>
 */
public class Solution2610 {

  public List<List<Integer>> findMatrix(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();

    for (int num : nums) {
      boolean added = false;

      for (List<Integer> row : res) {
        if (!row.contains(num)) {
          row.add(num);
          added = true;
          break;
        }
      }

      if (!added) {
        List<Integer> newList = new ArrayList<>();
        newList.add(num);
        res.add(newList);
      }
    }

    return res;
  }
}
