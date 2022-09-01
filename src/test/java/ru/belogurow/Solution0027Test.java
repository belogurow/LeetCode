package ru.belogurow;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0027Test {

	private final Solution0027 solution = new Solution0027();

	@Test
	void removeElement_ArrayOfFourElements() {
		int[] nums = {3, 2, 2, 3};

		assertThat(solution.removeElement(nums, 3))
				.isEqualTo(2);

		assertThat(nums)
				.startsWith(2, 2);
	}

	@Test
	void removeElement_ArrayOfEightElements() {
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

		assertThat(solution.removeElement(nums, 2))
				.isEqualTo(5);

		assertThat(Arrays.stream(nums).limit(5).sorted().toArray())
				.containsSequence(0, 0, 1, 3, 4);
	}

	@Test
	void removeElement_ArrayOfTwoSimilarElements() {
		int[] nums = {3, 3};

		assertThat(solution.removeElement(nums, 3))
				.isEqualTo(0);
	}

	@Test
	void removeElement_ArrayOfOneElements() {
		int[] nums = {1};

		assertThat(solution.removeElement(nums, 1))
				.isEqualTo(0);
	}
}