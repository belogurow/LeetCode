package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/decompress-run-length-encoded-list/">1313. Decompress Run-Length Encoded List</a>
 */
public class Solution1313 {

    public int[] decompressRLElist(int[] nums) {
        int newLength = 0;
        for (int i = 0, len = nums.length; i < len; i += 2) {
            newLength += nums[i];
        }

        int[] answer = new int[newLength];
        for (int i = 0, k = 0, len = nums.length; i < len; i += 2) {
            for (int j = 0; j < nums[i]; j++, k++) {
                answer[k] = nums[i + 1];
            }
        }

        return answer;
    }
}
