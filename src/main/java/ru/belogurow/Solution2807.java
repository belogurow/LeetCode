package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/">2807. Insert Greatest Common Divisors in Linked List</a>
 */
public class Solution2807 {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur.next != null) {
            ListNode next = cur.next;

            cur.next = new ListNode(gcd(cur.val, next.val), next);
            cur = next;
        }

        return head;
    }

    private int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}
