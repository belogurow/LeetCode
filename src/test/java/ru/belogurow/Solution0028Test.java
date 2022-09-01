package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0028Test {

	private final Solution0028 solution = new Solution0028();

	@Test
	void strStr_HasOccurrence_1() {
		assertThat(solution.strStr("hello", "ll"))
				.isEqualTo(2);
	}

	@Test
	void strStr_HasOccurrence_2() {
		assertThat(solution.strStr("mississippi", "issip"))
				.isEqualTo(4);
	}

	@Test
	void strStr_NoOccurrence() {
		assertThat(solution.strStr("aaaaa", "bba"))
				.isEqualTo(-1);
	}
}