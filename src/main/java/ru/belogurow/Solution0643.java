package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/maximum-average-subarray-i/"> 643. Maximum Average Subarray I</a>
 */
public class Solution0643 {

  public double findMaxAverage(int[] nums, int k) {
    int maxSum = 0;
    int curSum = 0;

    for (int i = 0; i < nums.length; i++) {
      if (i < k) {
        curSum += nums[i];
        maxSum = curSum;
      } else {
        curSum += nums[i] - nums[i - k];
        maxSum = Math.max(maxSum, curSum);
      }
    }

    return (double) maxSum / k;
  }
}
