package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">58. Length of Last Word</a>
 */
public class Solution0058 {

  public int lengthOfLastWord(String s) {
    String[] words = s.split(" ");
    return words[words.length - 1].length();
  }
}
