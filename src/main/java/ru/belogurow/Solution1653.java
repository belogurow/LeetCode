package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/">1653. Minimum Deletions to Make String Balanced</a>
 */
public class Solution1653 {

    public int minimumDeletions(String s) {
        int res = 0;
        int bCount = 0;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                bCount += 1;
            } else {
                res = Math.min(res + 1, bCount);
            }
        }

        return res;
    }
}
