package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2352Test {

  private final Solution2352 solution = new Solution2352();

  @Test
  void equalsPairs() {
    int[][] grid = new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};

    Assertions.assertThat(solution.equalPairs(grid))
        .isEqualTo(1);
  }

  @Test
  void equalsPairs2() {
    int[][] grid = new int[][]{{11, 1}, {1, 11}};

    Assertions.assertThat(solution.equalPairs(grid))
        .isEqualTo(2);
  }
}