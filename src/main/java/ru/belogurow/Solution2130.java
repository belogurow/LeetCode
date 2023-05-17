package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list">2130. Maximum Twin Sum of a Linked List</a>
 */
public class Solution2130 {

  public int pairSum(ListNode head) {
    int[] values = new int[100000 / 2]; // need store only half
    int n = 0;

    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      values[n++] = slow.val;
      slow = slow.next;
      fast = fast.next.next;
    }

    // slow is current mid
    // need to sum values[i] with it twin

    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      maxSum = Math.max(maxSum, values[n - i - 1] + slow.val);
      slow = slow.next;
    }

    return maxSum;
  }
}
