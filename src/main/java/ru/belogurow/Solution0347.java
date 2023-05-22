package ru.belogurow;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/top-k-frequent-elements/">347. Top K Frequent Elements</a>
 */
public class Solution0347 {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> numsCount = new HashMap<>();
    for (int num : nums) {
      numsCount.compute(num, (key, v) -> v == null ? 1 : v + 1);
    }

    Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(numsCount::get));

    for (int num : numsCount.keySet()) {
      heap.add(num);
      if (heap.size() > k) {
        heap.poll();
      }
    }

    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      res[i] = heap.poll();
    }

    return res;
  }
}
