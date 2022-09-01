package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0022Test {

	private final Solution0022 solution = new Solution0022();

	@Test
	void generateForN1() {
		assertThat(solution.generateParenthesis(1))
				.isNotNull()
				.hasSize(1)
				.contains("()");
	}

	@Test
	void generateForN2() {
		assertThat(solution.generateParenthesis(2))
				.isNotNull()
				.hasSize(2)
				.contains("(())", "()()");
	}

	@Test
	void generateForN3() {
		assertThat(solution.generateParenthesis(3))
				.isNotNull()
				.hasSize(5)
				.contains("((()))","(()())","(())()","()(())","()()()");
	}

	@Test
	void generateForN4() {
		assertThat(solution.generateParenthesis(4))
				.isNotNull()
				.hasSize(14)
				.contains("(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()");
	}
}