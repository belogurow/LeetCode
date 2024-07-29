package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/crawler-log-folder/">1598. Crawler Log Folder</a>
 */
public class Solution1598 {

    public int minOperations(String[] logs) {
        int result = 0;

        for (String log : logs) {
            if ("../".equals(log)) {
                result += result == 0 ? 0 : -1;
            } else if (!"./".equals(log)) {
                result += 1;
            }
        }

        return result;
    }
}
