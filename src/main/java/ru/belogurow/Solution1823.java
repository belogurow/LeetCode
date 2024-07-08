package ru.belogurow;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/find-the-winner-of-the-circular-game">1823. Find the Winner of the Circular Game</a>
 */
public class Solution1823 {

    public int findTheWinner(int n, int k) {
        List<Integer> players = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            players.add(i);
        }

        int startIndex = 0;

        while (players.size() != 1) {
            int removeIndex = (startIndex + k - 1) % players.size();

            players.remove(removeIndex);
            startIndex = removeIndex;
        }

        return players.getFirst();
    }
}
