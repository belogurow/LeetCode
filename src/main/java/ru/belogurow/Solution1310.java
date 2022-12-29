package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/xor-queries-of-a-subarray/">1310. XOR Queries of a Subarray</a>
 */
public class Solution1310 {

    public int[] xorQueries(int[] arr, int[][] queries) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] ^= arr[i - 1];
        }

        int queriesLen = queries.length;
        int[] output = new int[queriesLen];
        for (int i = 0; i < queriesLen; i++) {
            int L = queries[i][0];
            int R = queries[i][1];

            output[i] = (L == 0) ? arr[R] : arr[L - 1] ^ arr[R];

        }

        return output;
    }
}
