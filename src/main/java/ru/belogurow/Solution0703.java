package ru.belogurow;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-a-stream/">Kth Largest Element in a Stream</a>
 */
public class Solution0703 {

	public static class KthLargest {

		private final Queue<Integer> queue;
		private final int k;

		public KthLargest(int k, int[] nums) {
			this.queue = new PriorityQueue<>();
			this.k = k;

			for (int num : nums) {
				this.add(num);
			}
		}

		public int add(int val) {
			queue.add(val);
			if (queue.size() > k) {
				queue.poll();
			}

			return queue.peek();
		}
	}
}
