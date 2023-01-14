package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary">1491. Average Salary Excluding the Minimum and Maximum Salary</a>
 */
public class Solution1491 {

    public double average(int[] salary) {
        Arrays.sort(salary);

        double allSalary = 0;
        for (int i = 1, len = salary.length; i < len - 1; i++) {
            allSalary += salary[i];
        }

        return allSalary / (salary.length - 2);
    }
}
