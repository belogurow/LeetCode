package ru.belogurow;

import org.junit.jupiter.api.Test;
import ru.belogurow.common.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0019Test {

	private final Solution0019 solution = new Solution0019();

	@Test
	void removeNthFromEnd_FiveNodes() {
		ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

		assertThat(solution.removeNthFromEnd(node, 2)
				.convertToList())
				.hasSize(4)
				.containsExactly(1, 2, 3, 5);
	}

	@Test
	void removeNthFromEnd_OneNode() {
		ListNode node = new ListNode(1);

		assertThat(solution.removeNthFromEnd(node, 1))
				.isNull();
	}

	@Test
	void removeNthFromEnd_TwoNodes_RemoveLastElement() {
		ListNode node = new ListNode(1, new ListNode(2));

		assertThat(solution.removeNthFromEnd(node, 1)
				.convertToList())
				.hasSize(1)
				.containsExactly(1);
	}

	@Test
	void removeNthFromEnd_TwoNodes_RemoveFirstElement() {
		ListNode node = new ListNode(1, new ListNode(2));

		assertThat(solution.removeNthFromEnd(node, 2)
				.convertToList())
				.hasSize(1)
				.containsExactly(2);
	}
}