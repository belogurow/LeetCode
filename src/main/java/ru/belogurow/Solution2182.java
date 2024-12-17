package ru.belogurow;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/construct-string-with-repeat-limit/">2182. Construct String With Repeat Limit</a>
 */
public class Solution2182 {

    public String repeatLimitedString(String s, int repeatLimit) {
        Queue<Character> queue = new PriorityQueue<>((a, b) -> b - a);
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c - 'a'] == 0) {
                // add only first occurrence
                queue.add(c);
            }

            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        Character lastChar = null;

        while (!queue.isEmpty()) {
            char c = queue.poll();

            if (lastChar != null && lastChar.equals(c)) {
                if (!queue.isEmpty()) {
                    // extract next char
                    char nextC = queue.poll();

                    sb.append(nextC);
                    count[nextC - 'a']--;
                    lastChar = nextC;

                    if (count[nextC - 'a'] > 0) {
                        // return to queue
                        queue.add(nextC);
                    }
                } else {
                    // if queue is empty - return current result
                    break;
                }
            } else {
                for (int i = 0; i < repeatLimit && count[c - 'a'] > 0; count[c - 'a']--, i++) {
                    sb.append(c);
                }
                lastChar = c;
            }


            if (count[c - 'a'] > 0) {
                // return to queue
                queue.add(c);
            }
        }

        return sb.toString();
    }
}
