package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/goal-parser-interpretation/">1678. Goal Parser Interpretation</a>
 */
public class Solution1678 {

    public String interpret(String command) {
        StringBuilder res = new StringBuilder();

        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                res.append("G");
                i += 1;
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    res.append("o");
                    i += 2;
                } else {
                    res.append("al");
                    i += 4;
                }
            }
        }

        return res.toString();
    }
}
