package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/left-and-right-sum-differences/">2574. Left and Right Sum Differences</a>
 */
public class Solution2574 {

    public int[] leftRightDifference(int[] nums) {
        int answer[] = new int[nums.length];

        int leftSum = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = leftSum;
            leftSum += nums[i];
        }

        int rightSum = 0;
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = Math.abs(answer[i] - rightSum);
            rightSum += nums[i];
        }

        return answer;
    }
}
