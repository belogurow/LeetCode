package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/adding-spaces-to-a-string/">2109. Adding Spaces to a String</a>
 */
public class Solution2109 {

    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (j < spaces.length && i == spaces[j]) {
                sb.append(' ');
                j++;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
