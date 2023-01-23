package ru.belogurow;

import ru.belogurow.common.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/">1290. Convert Binary Number in a Linked List to Integer</a>
 */
public class Solution1290 {

    public int getDecimalValue(ListNode head) {
        int res = 0;

        while (head != null) {
            res = (res << 1) + head.val;
            head = head.next;
        }

        return res;
    }
}
