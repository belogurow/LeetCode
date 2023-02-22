package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0438Test {

	private final Solution0438 solution = new Solution0438();

	@Test
	void findAnagrams_VerifyAnswer() {
		String s = "cbaebabacd";
		String p = "abc";

		Assertions.assertThat(solution.findAnagrams(s, p))
				.containsExactly(0, 6);
	}

	@Test
	void findAnagrams_VerifyAnswer2() {
		String s = "abab";
		String p = "ab";

		Assertions.assertThat(solution.findAnagrams(s, p))
				.containsExactly(0, 1, 2);
	}
}