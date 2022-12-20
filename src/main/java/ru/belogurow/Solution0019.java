package ru.belogurow;

import ru.belogurow.common.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">LeetCode link</a>
 */
public class Solution0019 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		int i = 0;
		Map<Integer, ListNode> nodeWithIndex = new HashMap<>();

		ListNode currentNode = head;
		while (currentNode != null) {
			nodeWithIndex.put(i++, currentNode);
			currentNode = currentNode.getNext();
		}

		if (n == 1) {
			if (nodeWithIndex.size() == 1) { // remove only head
				return null;
			}

			nodeWithIndex.get(i - n - 1).setNext(null);
		} else if (i - n == 0) { // remove first element
			head = nodeWithIndex.get(i - n + 1);
		} else {
			nodeWithIndex.get(i - n - 1).setNext(nodeWithIndex.get(i - n + 1));
		}

		return head;
	}
}
