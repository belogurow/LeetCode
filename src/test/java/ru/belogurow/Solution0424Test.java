package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0424Test {

	private final Solution0424 solution = new Solution0424();

	@Test
	void characterReplacement_VerifyAnswer() {
		Assertions.assertThat(solution.characterReplacement("AABABBA", 1))
				.isEqualTo(4);
	}
}