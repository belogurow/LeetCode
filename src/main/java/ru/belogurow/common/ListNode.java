package ru.belogurow.common;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
	private final int val;
	private ListNode next;

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
}