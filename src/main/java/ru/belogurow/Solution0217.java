package ru.belogurow;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">217. Contains Duplicate</a>
 */
public class Solution0217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for (Integer n : nums) {
            if (!s.add(n)) {
                return true;
            }
        }

        return false;
    }

}
