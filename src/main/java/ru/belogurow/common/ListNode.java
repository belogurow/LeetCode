package ru.belogurow.common;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
	public final int val;
	public ListNode next;

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public int getVal() {
		return val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "ListNode{" +
				"val=" + val +
				", next=" + next +
				'}';
	}

	public List<Integer> convertToList() {
		List<Integer> values = new ArrayList<>();

		ListNode currentNode = this;
		while (currentNode != null) {
			values.add(currentNode.val);
			currentNode = currentNode.next;
		}

		System.out.println(values);

		return values;
	}

	public static ListNode convertToNodes(Integer... values) {
		if (values == null || values.length == 0) {
			return null;
		}

		ListNode head = new ListNode(-1);
		ListNode prev = head;
		for (Integer value : values) {
			prev.next = new ListNode(value);
			prev = prev.next;
		}

		return head.next;
	}
}