package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/">2114. Maximum Number of Words Found in Sentences</a>
 */
public class Solution2114 {

    public int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences)
                .mapToInt(sent -> sent.split(" ").length)
                .max()
                .orElseThrow();
    }
}
