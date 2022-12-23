package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/height-checker/">1051. Height Checker</a>
 */
public class Solution1051 {

    public int heightChecker(int[] heights) {
        int[] sorted = Arrays.stream(heights).sorted()
                .toArray();

        int differentHeight = 0;
        for (int i = 0, len = heights.length; i < len; i++) {
            if (heights[i] != sorted[i]) {
                differentHeight++;
            }
        }

        return differentHeight;
    }
}
