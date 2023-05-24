package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution2542Test {

  private final Solution2542 solution = new Solution2542();

  @Test
  void maxScore() {
    int[] nums1 = new int[]{1, 3, 3, 2};
    int[] nums2 = new int[]{2, 1, 3, 4};

    assertThat(solution.maxScore(nums1, nums2, 3))
        .isEqualTo(12);
  }

  @Test
  void maxScore2() {
    int[] nums1 = new int[]{7, 1, 1, 1};
    int[] nums2 = new int[]{1, 2, 3, 4};

    assertThat(solution.maxScore(nums1, nums2, 3))
        .isEqualTo(9);
  }

}