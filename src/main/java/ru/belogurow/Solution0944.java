package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/delete-columns-to-make-sorted/">944. Delete Columns to Make Sorted</a>
 */
public class Solution0944 {

    public int minDeletionSize(String[] strs) {
        int colToDelete = 0;

        for (int j = 0, strLen = strs[0].length(); j < strLen; j++) {
            for (int i = 1, strsLen = strs.length; i < strsLen; i++) {
                if (strs[i - 1].charAt(j) > strs[i].charAt(j)) {
                    colToDelete++;
                    break;
                }
            }
        }

        return colToDelete;
    }
}
