package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/shuffle-the-array/">LeetCode 1470. Shuffle the Array</a>
 */
public class Solution1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];

        for (int i = 0, j = 0; i < nums.length; j++) {
            answer[i++] = nums[j];
            answer[i++] = nums[j + n];
        }

        return answer;
    }
}
