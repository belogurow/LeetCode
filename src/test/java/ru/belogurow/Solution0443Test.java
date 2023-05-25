package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0443Test {

  private final Solution0443 solution = new Solution0443();

  @Test
  void compress() {
    char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};

    assertThat(solution.compress(chars))
        .isEqualTo(6);

    assertThat(chars)
        .containsSubsequence('a', '2', 'b', '2', 'c', '3');
  }
}