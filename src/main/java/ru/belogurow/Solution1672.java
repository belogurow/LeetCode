package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/richest-customer-wealth/">1672. Richest Customer Wealth</a>
 */
public class Solution1672 {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] account : accounts) {
            int wealth = 0;

            for (int bank : account) {
                wealth += bank;
            }

            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }

        return maxWealth;
    }
}
