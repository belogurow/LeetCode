package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0030Test {

	private final Solution0030 solution = new Solution0030();

	@Test
	void findSubstring_TwoWords() {
		String s = "barfoothefoobarman";
		String[] words = {"foo", "bar"};

		Assertions.assertThat(solution.findSubstring(s, words))
				.isNotNull()
				.hasSize(2)
				.containsExactly(0, 9);
	}

	@Test
	void findSubstring_FourWords() {
		String s = "wordgoodgoodgoodbestword";
		String[] words = {"word", "good", "best", "word"};

		Assertions.assertThat(solution.findSubstring(s, words))
				.isNotNull()
				.isEmpty();
	}

	@Test
	void findSubstring_FourWords2() {
		String s = "wordgoodgoodgoodbestword";
		String[] words = {"word", "good", "best", "good"};

		Assertions.assertThat(solution.findSubstring(s, words))
				.isNotNull()
				.hasSize(1)
				.containsExactly(8);
	}

	@Test
	void findSubstring_ThreeWords() {
		String s = "barfoofoobarthefoobarman";
		String[] words = {"bar", "foo", "the"};

		Assertions.assertThat(solution.findSubstring(s, words))
				.isNotNull()
				.hasSize(3)
				.containsExactly(6, 9, 12);
	}

	@Test
	void findSubstring_FiveWords() {
		String s = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
		String[] words = {"fooo", "barr", "wing", "ding", "wing"};

		Assertions.assertThat(solution.findSubstring(s, words))
				.isNotNull()
				.hasSize(1)
				.containsExactly(13);
	}
}