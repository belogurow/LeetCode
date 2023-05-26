package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/stone-game/">877. Stone Game</a>
 */
public class Solution0877 {

  public boolean stoneGame(int[] piles) {
    Arrays.sort(piles);

    int bob = 0, alice = 0;
    for (int i = piles.length - 1; i >= 0; i--) {
      if (i % 2 != 0) {
        alice += piles[i];
      } else {
        bob += piles[i];
      }
    }

    return alice > bob;
  }
}
