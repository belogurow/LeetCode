package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/find-the-original-array-of-prefix-xor/">2433. Find The Original Array of Prefix Xor</a>
 */
public class Solution2433 {

    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];

        result[0] = pref[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = pref[i - 1] ^ pref[i];
        }

        return result;
    }
}
