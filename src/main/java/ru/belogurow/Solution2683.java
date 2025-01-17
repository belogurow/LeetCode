package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/neighboring-bitwise-xor/">2683. Neighboring Bitwise XOR</a>
 */
public class Solution2683 {

    public boolean doesValidArrayExist(int[] derived) {
        int xorSum = 0;

        for (int num : derived) {
            xorSum ^= num;
        }

        return xorSum == 0;
    }
}
