package ru.belogurow;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/last-stone-weight/">1046. Last Stone Weight</a>
 */
public class Solution1046 {

	public int lastStoneWeight(int[] stones) {
		Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

		for (int stone : stones) {
			queue.add(stone);
		}

		while (queue.size() >= 2) {
			int first = queue.poll();
			int second = queue.poll();

			if (first != second) {
				queue.add(first - second);
			}
		}

		return queue.isEmpty() ? 0 : queue.peek();
	}
}
