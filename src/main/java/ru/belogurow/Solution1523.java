package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/">1523. Count Odd Numbers in an Interval Range</a>
 */
public class Solution1523 {

    public int countOdds(int low, int high) {
        int countOdds = (high - low) / 2;

        if (low % 2 == 1 || high % 2 == 1) {
            countOdds++;
        }

        return countOdds;
    }
}
