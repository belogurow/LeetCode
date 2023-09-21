package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/number-of-employees-who-met-the-target">2798. Number of Employees Who Met the Target</a>
 */
public class Solution2798 {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;

        for (int h : hours) {
            if (h >= target) {
                result++;
            }
        }

        return result;
    }
}
