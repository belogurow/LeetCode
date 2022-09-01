package ru.belogurow;

import org.junit.jupiter.api.Test;
import ru.belogurow.common.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0023Test {

	private final Solution0023 solution = new Solution0023();

	@Test
	void mergeKList_NoLists() {
		assertThat(solution.mergeKLists(new ListNode[] {}))
				.isNull();
	}

	@Test
	void mergeKList_TwoSimpleLists() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);

		assertThat(solution.mergeKLists(new ListNode[] {first, second})
				.convertToList())
				.hasSize(2)
				.containsExactly(1, 2);
	}

	@Test
	void mergeKList_ThreeLists() {
		ListNode first = new ListNode(1, new ListNode(4, new ListNode(5)));
		ListNode second = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode third = new ListNode(2, new ListNode(6));

		assertThat(solution.mergeKLists(new ListNode[] {first, second, third})
				.convertToList())
				.hasSize(8)
				.containsExactly(1, 1, 2, 3, 4, 4, 5, 6);
	}
}