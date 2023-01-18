package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/maximum-sum-circular-subarray/">918. Maximum Sum Circular Subarray</a>
 *
 * todo retry for time O(N)
 */
public class Solution0918 {

    public int maxSubarraySumCircular(int[] nums) {
        int numLen = nums.length;
        if (numLen == 1) {
            return nums[0];
        }

        int maxSum = Integer.MIN_VALUE;

        int curSum = 0, countForMaxSum = 0, idxForFirstElem = 0;
        for (int i = 0, len = numLen * 2 - 1; i < len; i++) {
            int curNum = nums[i % numLen];

            if (curSum + curNum > curNum) {
                curSum += curNum;
                countForMaxSum++;
            } else {
                curSum = curNum;
                countForMaxSum = 1;
                idxForFirstElem = i;
            }

            maxSum = Math.max(curSum, maxSum);

            if (countForMaxSum == numLen) {
                countForMaxSum = 0;
                curSum = 0;
                i = idxForFirstElem + 1;
            }
        }

        return maxSum;
    }
}
