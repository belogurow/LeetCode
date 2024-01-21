package ru.belogurow;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/sliding-window-median/">480. Sliding Window Median</a>
 * fixme не проходит по времени на предпоследнем тесте
 */
public class Solution0480 {

	public double[] medianSlidingWindow(int[] nums, int k) {
		Queue<Integer> min = new PriorityQueue<>();
		Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

		double[] res = new double[nums.length - k + 1];

		for (int i = 0; i < nums.length; i++) {
			add(max, min, nums[i]);

			if (i >= k - 1) {
				res[i - k + 1] = getMedian(max, min, k);
				remove(max, min, nums[i - k + 1]);
			}
		}

		return res;
	}

	private void add(Queue<Integer> max, Queue<Integer> min, int num) {
		if (max.isEmpty() || max.peek() > num) {
			max.add(num);
		} else {
			min.add(num);
		}
		balance(max, min);
	}

	private void remove(Queue<Integer> max, Queue<Integer> min, int num) {
		if (num <= max.peek()) {
			max.remove(num);
		} else {
			min.remove(num);
		}
		balance(max, min);
	}

	private void balance(Queue<Integer> max, Queue<Integer> min) {
		if (max.size() > min.size() + 1) {
			min.add(max.poll());
		} else if (min.size() > max.size()) {
			max.add(min.poll());
		}
	}

	private double getMedian(Queue<Integer> max, Queue<Integer> min, int k) {
		if (k % 2 == 0) {
			return max.peek() / 2.0 + min.peek() / 2.0;
		}

		return max.peek();
	}
}
