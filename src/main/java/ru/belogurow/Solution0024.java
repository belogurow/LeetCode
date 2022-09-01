package ru.belogurow;


import ru.belogurow.common.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 *
 * @see <a href="https://leetcode.com/problems/swap-nodes-in-pairs/">LeetCode link</a>
 */
public class Solution0024 {

	public ListNode swapPairs(ListNode current) {
		if (current == null || current.next == null) {
			return current;
		}

		ListNode secondNode = current.next;
		ListNode thirdNode = secondNode.next;
		current.next = swapPairs(thirdNode); // current already second
		secondNode.next = current; // second already current

		return secondNode;
	}
}
