package ru.belogurow;

import org.junit.jupiter.api.Test;
import ru.belogurow.common.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0024Test {

	private final Solution0024 solution = new Solution0024();

	@Test
	void swapPairs_HeadIsNull() {
		assertThat(solution.swapPairs(null))
				.isNull();
	}

	@Test
	void swapPairs_OneNode() {
		ListNode node = new ListNode(5);

		assertThat(solution.swapPairs(node)
				.convertToList())
				.hasSize(1)
				.containsExactly(5);
	}

	@Test
	void swapPairs_ThreeNodes() {
		ListNode node = new ListNode(1, new ListNode(2, new ListNode(3)));

		assertThat(solution.swapPairs(node)
				.convertToList())
				.hasSize(3)
				.containsExactly(2, 1, 3);
	}

	@Test
	void swapPairs_FourNodes() {
		ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

		assertThat(solution.swapPairs(node)
				.convertToList())
				.hasSize(4)
				.containsExactly(2, 1, 4, 3);
	}
}