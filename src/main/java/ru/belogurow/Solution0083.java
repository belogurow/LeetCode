package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">83. Remove Duplicates from Sorted List</a>
 */
public class Solution0083 {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode prev = new ListNode(-101, head);
		ListNode current = head;

		while (current != null) {
			if (prev.val == current.val) {
				prev.next = current.next;
			} else {
				prev = current;
			}

			current = current.next;
		}

		return head;
	}
}
