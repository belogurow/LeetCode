package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a>
 */
public class Solution0876 {

	public ListNode middleNode(ListNode head) {
		ListNode middle = head;

		int i = 0;
		while (head != null) {
			i += 1;
			head = head.next;

			if (i % 2 == 0) {
				middle = middle.next;
			}
		}

		return middle;
	}
}
