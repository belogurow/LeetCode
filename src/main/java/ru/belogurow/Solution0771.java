package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/jewels-and-stones/">771. Jewels and Stones</a>
 */
public class Solution0771 {

    public int numJewelsInStones(String jewels, String stones) {
        int jewelsCount = 0;

        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) {
                jewelsCount++;
            }
        }

        return jewelsCount;
    }
}
