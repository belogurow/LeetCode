package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2477Test {

	private final Solution2477 solution = new Solution2477();

	@Test
	void minimumFuelCost_VerifyAnswer() {
		int[][] roads = new int[][]{{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}};

		Assertions.assertThat(solution.minimumFuelCost(roads, 2))
				.isEqualTo(7);
	}
}