package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/">1309. Decrypt String from Alphabet to Integer Mapping</a>
 */
public class Solution1309 {

    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0, len = s.length(); i < len;) {
            if (i + 2 < len && s.charAt(i + 2) == '#') {
                res.append((char) ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0') + 'a' - 1));
                i += 3;
            } else {
                res.append((char) ((s.charAt(i) - '0') + 'a' - 1));
                i += 1;
            }
        }

        return res.toString();
    }
}
