package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1162Test {

	private final Solution1162 solution = new Solution1162();

	@Test
	void maxDistance_VerifyAnswer() {
		int[][] grid = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};

		Assertions.assertThat(solution.maxDistance(grid))
				.isEqualTo(2);
	}

	@Test
	void maxDistance_VerifyAnswer2() {
		int[][] grid = new int[][]{{1, 0, 0}, {0, 0, 0}, {0, 0, 0}};

		Assertions.assertThat(solution.maxDistance(grid))
				.isEqualTo(4);
	}
}