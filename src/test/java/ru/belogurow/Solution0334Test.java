package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0334Test {

  private final Solution0334 solution = new Solution0334();

  @Test
  void increasingTriplet() {
    int[] nums = new int[]{2, 1, 5, 0, 4, 6};

    assertThat(solution.increasingTriplet(nums))
        .isTrue();
  }

  @Test
  void increasingTriplet2() {
    int[] nums = new int[]{20, 100, 12, 5, 13, 100};

    assertThat(solution.increasingTriplet(nums))
        .isTrue();
  }
}