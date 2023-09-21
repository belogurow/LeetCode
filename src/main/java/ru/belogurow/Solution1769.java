package ru.belogurow;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/">1769. Minimum Number of Operations to Move All Balls to Each Box</a>
 */
public class Solution1769 {

    public int[] minOperations(String boxes) {
        final int n = boxes.length();

        int[] operations = new int[n];
        for (int i = 0, ones = 0; i < n; i++) {
            if (i != 0) {
                operations[i] = operations[i - 1] + ones;
            }

            ones += boxes.charAt(i) == '1' ? 1 : 0;
        }

        for (int i = n - 1, ones = 0, rightOperations = 0; i >= 0; i--) {
            if (i != n - 1) {
                rightOperations += ones;
                operations[i] += rightOperations;
            }

            ones += boxes.charAt(i) == '1' ? 1 : 0;
        }

        return operations;
    }

    public int[] minOperations2(String boxes) {
        Set<Integer> boxesWithBall = new HashSet<>();

        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                boxesWithBall.add(i);
            }
        }

        int[] minOperations = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            for (Integer boxWithBall : boxesWithBall) {
                if (boxWithBall == i) {
                    continue;
                }

                minOperations[i] += Math.abs(i - boxWithBall);
            }
        }

        return minOperations;
    }
}
