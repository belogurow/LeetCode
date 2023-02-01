package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/linked-list-cycle/">141. Linked List Cycle</a>
 */
public class Solution0141 {

	public boolean hasCycle(ListNode head) {
		ListNode lazy = head;
		ListNode fast = head;

		do {
			if (fast == null || fast.next == null) {
				return false;
			}

			lazy = lazy.next;
			fast = fast.next.next;
		} while (lazy != fast);


		return true;
	}
}
