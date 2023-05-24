package ru.belogurow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/maximum-subsequence-score/">2542. Maximum Subsequence Score</a>
 */
public class Solution2542 {

  public long maxScore(int[] nums1, int[] nums2, int k) {
    List<Pair> pairs = new ArrayList<>();
    for (int i = 0; i < nums2.length; i++) {
      pairs.add(new Pair(nums1[i], nums2[i]));
    }

    pairs.sort(Comparator.reverseOrder());

    Queue<Integer> heap = new PriorityQueue<>(k, Integer::compare);
    long topKSum = 0;
    for (int i = 0; i < k; i++) {
      topKSum += pairs.get(i).num1;
      heap.add(pairs.get(i).num1);
    }

    long answer = topKSum * pairs.get(k - 1).num2;

    for (int i = k; i < pairs.size(); i++) {
      topKSum = topKSum + pairs.get(i).num1 - heap.poll();
      heap.add(pairs.get(i).num1);

      answer = Math.max(answer, topKSum * pairs.get(i).num2);
    }

    return answer;
  }

  private record Pair(int num1, int num2) implements Comparable<Pair> {

    @Override
    public int compareTo(Pair o) {
      if (num2 == o.num2) {
        return Integer.compare(num1, o.num1);
      } else {
        return Integer.compare(num2, o.num2);
      }
    }
  }
}
