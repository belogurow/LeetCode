package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/decode-xored-array/">1720. Decode XORed Array</a>
 */
public class Solution1720 {

    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;

        for (int i = 0, len = encoded.length; i < len; i++) {
            ans[i + 1] = encoded[i] ^ ans[i];
        }

        return ans;
    }
}
