package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/increasing-triplet-subsequence/">334. Increasing Triplet Subsequence</a>
 */
public class Solution0334 {

  public boolean increasingTriplet(int[] nums) {
    if (nums.length < 3) {
      return false;
    }

    int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
    for (int num : nums) {
      if (num <= min1) {
        min1 = num;
      } else if (num <= min2) {
        min2 = num;
      } else {
        return true;
      }
    }

    return false;
  }
}
