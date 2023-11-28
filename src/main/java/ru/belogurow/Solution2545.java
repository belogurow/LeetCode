package ru.belogurow;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode.com/problems/sort-the-students-by-their-kth-score/">2545. Sort the Students by Their Kth Score</a>
 */
public class Solution2545 {

    public int[][] sortTheStudents(int[][] score, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[k] - a[k]);
        Collections.addAll(queue, score);

        for (int i = 0; i < score.length; i++) {
            score[i] = queue.poll();
        }

        return score;
    }
}
