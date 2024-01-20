package ru.belogurow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/partition-labels/">763. Partition Labels</a>
 */
public class Solution0763 {

    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastIdx = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            lastIdx.put(s.charAt(i), i);
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int endInterval = lastIdx.get(c);

            // checks all chars appears only in interval [i; endInterval]
            for (int j = i + 1; j <= endInterval; j++) {
                if (lastIdx.get(s.charAt(j)) > endInterval) {
                    endInterval = lastIdx.get(s.charAt(j));
                } else {
                    // ok
                }
            }

            res.add(endInterval + 1 - i);
            // ignore next increment
            i = endInterval;
        }

        return res;
    }
}
