package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution0239Test {

    private final Solution0239 solution = new Solution0239();

    @Test
    void verifyAnswer() {
        final int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        final int k = 3;

        assertThat(solution.maxSlidingWindow(nums, k))
                .containsExactly(3, 3, 5, 5, 6, 7);
    }

    @Test
    void verifyAnswer2() {
        final int[] nums = new int[]{7, 2, 4};
        final int k = 2;

        assertThat(solution.maxSlidingWindow(nums, k))
                .containsExactly(7, 4);
    }
}