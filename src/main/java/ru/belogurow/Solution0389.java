package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/find-the-difference/">389. Find the Difference</a>
 */
public class Solution0389 {

    public char findTheDifference(String s, String t) {
        char diff = 0;

        for (int i = 0; i < s.length(); i++) {
            diff ^= s.charAt(i);
            diff ^= t.charAt(i);
        }

        return (char) (diff ^ t.charAt(t.length() - 1));
    }
}
