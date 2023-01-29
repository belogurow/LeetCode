package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Solution0118Test {

	private final Solution0118 solution = new Solution0118();

	@Test
	void generate_VerifyAnswer() {
		List<List<Integer>> answer = List.of(
				List.of(1),
				List.of(1, 1),
				List.of(1, 2, 1),
				List.of(1, 3, 3, 1),
				List.of(1, 4, 6, 4, 1));

		Assertions.assertThat(solution.generate(5))
				.isEqualTo(answer);
	}
}