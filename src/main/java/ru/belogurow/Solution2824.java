package ru.belogurow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/">2824. Count Pairs Whose Sum is Less than Target</a>
 */
public class Solution2824 {

    public int countPairs(List<Integer> nums, int target) {
        int result = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    result++;
                }
            }
        }

        return result;
    }
}
