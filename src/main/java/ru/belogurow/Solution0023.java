package ru.belogurow;

import ru.belogurow.common.ListNode;

import java.util.Arrays;
import java.util.Objects;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 * @see <a href="https://leetcode.com/problems/merge-k-sorted-lists/">LeetCode link</a>
 */
public class Solution0023 {

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0 || Arrays.stream(lists).allMatch(Objects::isNull)) {
			return null;
		}

		return new ListNode(findMin(lists), mergeKLists(lists));
	}

	private int findMin(ListNode[] lists) {
		int idxWithMin = 0;
		int minimum = Integer.MAX_VALUE;

		for (int i = 0; i < lists.length; i++) {
			if (lists[i] == null) {
				continue;
			}

			if (lists[i].getVal() < minimum) {
				minimum = lists[i].getVal();
				idxWithMin = i;
			}
		}

		lists[idxWithMin] = lists[idxWithMin].getNext();
		return minimum;
	}
}
