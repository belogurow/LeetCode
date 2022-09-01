package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0026Test {

	private final Solution0026 solution = new Solution0026();

	@Test
	void removeDuplicates_ArrayOfThreeElements() {
		int[] nums = new int[]{1, 1, 2};

		assertThat(solution.removeDuplicates(nums))
				.isEqualTo(2);

		assertThat(nums)
				.hasSize(3)
				.startsWith(1, 2);
	}

	@Test
	void removeDuplacates_ArrayOfNineElements() {
		int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

		assertThat(solution.removeDuplicates(nums))
				.isEqualTo(5);

		assertThat(nums)
				.hasSize(10)
				.startsWith(0, 1, 2, 3, 4);
	}
}