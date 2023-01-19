package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/">1790. Check if One String Swap Can Make Strings Equal</a>
 */
public class Solution1790 {

    public boolean areAlmostEqual(String s1, String s2) {
        int[] diffChars = new int[2];
        int diffCharsCount = 0;

        for (int i = 0, len = s1.length(); i < len; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            }
            if (diffCharsCount == 2) {
                return false;
            }

            if (diffChars[0] == 0) {
                diffChars[0] = s1.charAt(i);
                diffChars[1] = s2.charAt(i);
                diffCharsCount++;
            } else if (diffChars[0] == s2.charAt(i) && diffChars[1] == s1.charAt(i)) {
                diffCharsCount++;
            } else {
                return false;
            }
        }

        return diffCharsCount == 0 || diffCharsCount == 2;
    }
}
