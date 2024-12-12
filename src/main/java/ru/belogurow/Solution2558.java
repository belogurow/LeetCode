package ru.belogurow;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/take-gifts-from-the-richest-pile/">2558. Take Gifts From the Richest Pile</a>
 */
public class Solution2558 {

    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> giftsQueue = new PriorityQueue<>((a, b) -> b - a);
        long result = 0L;

        for (int gift : gifts) {
            giftsQueue.add(gift);
            result += gift;
        }

        for (int i = 0; i < k; i++) {
            int maxGift = giftsQueue.poll();
            int newGift = (int) Math.sqrt(maxGift);
            giftsQueue.add(newGift);

            result += newGift - maxGift;
        }

        return result;
    }

}
