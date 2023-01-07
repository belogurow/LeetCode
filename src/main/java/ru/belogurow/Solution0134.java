package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/gas-station/">134. Gas Station</a>
 */
public class Solution0134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remains = 0, total = 0, startIndex = 0;

        for (int i = 0, len = gas.length; i < len; i++) {
            int gasValue = gas[i] - cost[i];
            remains += gasValue;
            total += gasValue;
            if (remains < 0) {
                startIndex = i + 1;
                remains = 0;
            }
        }

        return (total < 0) ? -1 : startIndex;
    }
}
