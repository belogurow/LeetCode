package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class Solution0031Test {

	private final Solution0031 solution = new Solution0031();

	@Test
	void nextPermutation_VerifyLatestPermutation() {
		int[] nums = {3, 2, 1};
		solution.nextPermutation(nums);

		assertThat(nums)
				.hasSize(3)
				.containsExactly(1, 2, 3);
	}

	@Test
	void nextPermutation_VerifyLatestPermutation2() {
		int[] nums = {7, 7, 5, 2};
		solution.nextPermutation(nums);

		assertThat(nums)
				.hasSize(4)
				.containsExactly(2, 5, 7, 7);
	}

	@Test
	void nextPermutation_FiveElements() {
		int[] nums = {4, 5, 7, 6, 1};
		solution.nextPermutation(nums);

		assertThat(nums)
				.hasSize(5)
				.containsExactly(4, 6, 1, 5, 7);
	}

	@Test
	void nextPermutation_FiveElements2() {
		int[] nums = {2, 3, 1, 3, 3};
		solution.nextPermutation(nums);

		assertThat(nums)
				.hasSize(5)
				.containsExactly(2, 3, 3, 1, 3);
	}
}