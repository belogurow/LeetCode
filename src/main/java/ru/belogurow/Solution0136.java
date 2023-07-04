package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/single-number/">136. Single Number</a>
 */
public class Solution0136 {

  public int singleNumber(int[] nums) {
    int res = 0;

    for (int num : nums) {
      res ^= num;
    }

    return res;
  }
}
