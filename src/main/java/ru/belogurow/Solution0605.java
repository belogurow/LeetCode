package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/can-place-flowers/">605. Can Place Flowers</a>
 */
public class Solution0605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0) {
                boolean leftZero = i == 0 || flowerbed[i - 1] == 0;
                boolean rightZero = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

                if (leftZero && rightZero) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }

        return n == 0;
    }
}
