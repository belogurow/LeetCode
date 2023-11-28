package ru.belogurow;

import ru.belogurow.common.ListNode;

import java.util.*;

/**
 * @see <a href="https://leetcode.com/problems/sort-the-students-by-their-kth-score/">2545. Sort the Students by Their Kth Score</a>
 */
public class Solution2545 {

	public int[][] sortTheStudents(int[][] score, int k) {
		PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>(){
			public int compare(int[] a ,int[] b) {
				return b[k]-a[k];
			}
		});

        Collections.addAll(queue, score);

		for (int i = 0; i < score.length; i++) {
			score[i] = queue.poll();
		}

		return score;
	}
}
