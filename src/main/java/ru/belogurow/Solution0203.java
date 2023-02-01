package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/remove-linked-list-elements/">203. Remove Linked List Elements</a>
 */
public class Solution0203 {

	public ListNode removeElements(ListNode head, int val) {
		ListNode fakeHead = new ListNode(-1, head);
		ListNode prev = fakeHead;

		while (prev.next != null) {
			if (prev.next.val == val) {
				prev.next = prev.next.next;
			} else {
				prev = prev.next;
			}
		}

		return fakeHead.next;
	}
}
