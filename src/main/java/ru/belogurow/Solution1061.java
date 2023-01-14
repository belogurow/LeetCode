package ru.belogurow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-equivalent-string/">1061. Lexicographically Smallest Equivalent String</a>
 *
 * todo try recursive
 */
public class Solution1061 {

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        List<Set<Character>> equivalentChars = new ArrayList<>();

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();

        for (int i = 0, len = s1Chars.length; i < len; i++) {
            char s1Char = s1Chars[i];
            char s2Char = s2Chars[i];

            int firstCharSetIndex = -1;
            int secondCharSetIndex = -1;

            for (int j = 0, eqCharLen = equivalentChars.size(); j < eqCharLen; j++) {
                if (firstCharSetIndex != -1 && secondCharSetIndex != -1) {
                    break;
                }

                Set<Character> chars = equivalentChars.get(j);
                if (firstCharSetIndex == -1 && chars.contains(s1Char)) {
                    firstCharSetIndex = j;
                }

                if (secondCharSetIndex == -1 && chars.contains(s2Char)) {
                    secondCharSetIndex = j;
                }
            }

            if (firstCharSetIndex == -1 && secondCharSetIndex == -1) {
                // create new set
                Set<Character> newSet = new TreeSet<>();
                newSet.add(s1Char);
                newSet.add(s2Char);
                equivalentChars.add(newSet);
            } else if (firstCharSetIndex == -1) {
                // add first char to second char set
                equivalentChars.get(secondCharSetIndex).add(s1Char);
            } else if (secondCharSetIndex == -1) {
                // add second char to first char set
                equivalentChars.get(firstCharSetIndex).add(s2Char);
            } else if (firstCharSetIndex != secondCharSetIndex) {
                // union two sets
                equivalentChars.get(firstCharSetIndex).addAll(equivalentChars.remove(secondCharSetIndex));
            }

        }

        Map<Character, Character> charToSmallestChar = new HashMap<>();
        StringBuilder equivalentString = new StringBuilder();
        for (int i = 0, len = baseStr.length(); i < len; i++) {
            char baseStrChar = baseStr.charAt(i);

            if (charToSmallestChar.containsKey(baseStrChar)) {
                equivalentString.append(charToSmallestChar.get(baseStrChar));
            } else {

                boolean baseStrContainsChar = false;

                for (Set<Character> chars : equivalentChars) {
                    if (chars.contains(baseStrChar)) {
                        char smallensEqChar = chars.iterator().next();
                        equivalentString.append(smallensEqChar);
                        charToSmallestChar.put(baseStrChar, smallensEqChar);
                        baseStrContainsChar = true;
                        break;
                    }
                }

                if (!baseStrContainsChar) {
                    equivalentString.append(baseStrChar);
                }
            }
        }

        return equivalentString.toString();
    }
}
