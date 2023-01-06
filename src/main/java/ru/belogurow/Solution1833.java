package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/maximum-ice-cream-bars/">1833. Maximum Ice Cream Bars</a>
 */
public class Solution1833 {
    
  public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int iceCreamCount = 0;

        for (int i = 0, len = costs.length; i < len; i++) {
            if (coins >= costs[i]) {
                iceCreamCount++;
                coins -= costs[i];
            } else {
                break;
            }
        }

        return iceCreamCount;
    }
}
