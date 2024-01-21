package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0480Test {

    private final Solution0480 solution = new Solution0480();

    @Test
    void verifyAnswer() {
        final int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        final int k = 3;

        assertThat(solution.medianSlidingWindow(nums, k))
                .containsExactly(1, -1, -1, 3, 5, 6);
    }

    @Test
    void verifyAnswer2() {
        final int[] nums = new int[]{1,2,3,4,2,3,1,4,2};
        final int k = 4;

        assertThat(solution.medianSlidingWindow(nums, k))
                .containsExactly(2.5, 2.5, 3, 2.5, 2.5, 2.5);
    }
}