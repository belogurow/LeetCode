package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/linked-list-cycle-ii/">142. Linked List Cycle II</a>
 */
public class Solution0142 {

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow.equals(fast)) {
				break;
			}
		}

		if (fast == null || fast.next == null) {
			return null;
		}

		while (!head.equals(fast)) {
			head = head.next;
			fast = fast.next;
		}

		return head;
	}
}
