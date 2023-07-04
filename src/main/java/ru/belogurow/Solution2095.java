package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/">2095. Delete the Middle Node of a Linked List</a>
 */
public class Solution2095 {

  public ListNode deleteMiddle(ListNode head) {
    if (head.next == null) {
      // head is middle
      return null;
    }

    ListNode slow = head, fast = head.next.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    slow.next = slow.next.next;
    return head;
  }
}
