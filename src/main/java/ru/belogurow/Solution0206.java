package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a>
 */
public class Solution0206 {

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}

		return prev;
	}

	public ListNode reverseListRecursive(ListNode head) {
		return rec(null, head);
	}

	private ListNode rec(ListNode prev, ListNode head) {
		if (head == null) {
			return prev;
		}

		ListNode next = head.next;
		head.next = prev;
		return rec(head, next);
	}
}
