package ru.belogurow;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/">2391. Minimum Amount of Time to Collect Garbage</a>
 */
public class Solution2391 {

    public int garbageCollection(String[] garbage, int[] travel) {
        for (int i = 1; i < travel.length; i++) {
            travel[i] += travel[i - 1];
        }

        int total = 0;
        Map<Character, Integer> lastIdx = new HashMap<>();

        for (int i = 0; i < garbage.length; i++) {
            for (char c : garbage[i].toCharArray()) {
                total += 1;
                lastIdx.put(c, i);
            }
        }

        for (Map.Entry<Character, Integer> entry : lastIdx.entrySet()) {
            if (entry.getValue() > 0) {
                total += travel[entry.getValue() - 1];
            }
        }

        return total;
    }
}
