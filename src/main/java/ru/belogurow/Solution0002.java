package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>
 */
public class Solution0002 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode root = new ListNode(-1);
    ListNode current = root;

    int carry = 0;
    while (l1 != null || l2 != null) {
      int newVal = carry;

      if (l1 != null) {
        newVal += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        newVal += l2.val;
        l2 = l2.next;
      }

      carry = newVal / 10;
      newVal %= 10;

      current.next = new ListNode(newVal);
      current = current.next;
    }

    if (carry > 0) {
      current.next = new ListNode(carry);
    }

    return root.next;
  }
}
