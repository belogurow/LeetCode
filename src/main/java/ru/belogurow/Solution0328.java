package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/odd-even-linked-list/">328. Odd Even Linked List</a>
 */
public class Solution0328 {

  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode odd = head;
    ListNode firstEven = head.next;
    ListNode even = firstEven;

    while (even != null && even.next != null) {
      odd.next = odd.next.next;
      odd = odd.next;
      even.next = even.next.next;
      even = even.next;
    }

    odd.next = firstEven;
    return head;
  }
}
