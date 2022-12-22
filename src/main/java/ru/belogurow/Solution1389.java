package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/create-target-array-in-the-given-order/">1389. Create Target Array in the Given Order</a>
 */
public class Solution1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] answer = new int[nums.length];

        for (int i = 0, len = nums.length; i < len; i++) {
            int idx = index[i];
            System.arraycopy(answer, idx, answer, idx + 1, len - idx - 1);
            answer[idx] = nums[i];
        }

        return answer;
    }
}
