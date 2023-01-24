package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/verifying-an-alien-dictionary/">953. Verifying an Alien Dictionary</a>
 */
public class Solution0953 {

    public boolean isAlienSorted(String[] words, String order) {
        int[] charOrder = new int[26];
        for (int i = 0; i < 26; i++) {
            charOrder[order.charAt(i) - 'a'] = i;
        }


        for (int i = 1; i < words.length; i++) {
            int firstLen = words[i - 1].length(), secondLen = words[i].length();
            int maxLen = Math.max(firstLen, secondLen);

            for (int j = 0; j < maxLen; j++) {
                if (j == firstLen) {
                    // i - 1 shorter - ok
                    break;
                } else if (j == secondLen) {
                    // i shorter
                    return false;
                }

                int c1 = words[i - 1].charAt(j) - 'a';
                int c2 = words[i].charAt(j) - 'a';
                if (charOrder[c1] < charOrder[c2]) { // ok
                    break;
                } else if (charOrder[c1] > charOrder[c2]) {
                    return false;
                }
            }
        }

        return true;
    }
}
