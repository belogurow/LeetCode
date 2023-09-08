package ru.belogurow;


import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/">215. Kth Largest Element in an Array</a>
 */
public class Solution0215 {

	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

		for (int num : nums) {
			queue.add(num);
		}

		while (k > 1) {
			queue.poll();
			k--;
		}

		return queue.peek();
	}
}
