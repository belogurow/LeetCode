package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0198Test {

    private final Solution0198 solution = new Solution0198();

    @Test
    void verifyAnswer() {
        int[] nums = new int[] {2, 1, 1, 2};

        assertThat(solution.rob(nums))
                .isEqualTo(4);
    }
}