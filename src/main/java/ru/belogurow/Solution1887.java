package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal">1887. Reduction Operations to Make the Array Elements Equal</a>
 */
public class Solution1887 {

    public int reductionOperations(int[] nums) {
        int[] occurrences = new int[50001];
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            occurrences[num] += 1;
        }

        occurrences[min] = 0;

        int operations = 0;
        int count = 0;

        for (int occurrence : occurrences) {
            if (occurrence > 0) {
                count += 1;
                operations += occurrence * count;
            }
        }

        return operations;
    }
}
