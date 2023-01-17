package ru.belogurow;

import java.util.Objects;

/**
 * @see <a href="https://leetcode.com/problems/flip-string-to-monotone-increasing/">926. Flip String to Monotone Increasing</a>
 */
public class Solution0926 {

    // for every digit found min(left one's count + right zero's count)
    public int minFlipsMonoIncr(String s) {
        int leftOnes = 0, rightZeros = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                rightZeros++;
            }
        }

        int minFlips = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                minFlips = Math.min(minFlips, leftOnes + rightZeros);
                leftOnes++;
            } else {
                minFlips = Math.min(minFlips, leftOnes + rightZeros - 1);
                rightZeros--;
            }
        }

        return minFlips;
    }
}
