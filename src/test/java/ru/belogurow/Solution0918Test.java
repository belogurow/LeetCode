package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0918Test {

    private final Solution0918 solution = new Solution0918();

    @Test
    void maxSubarraySumCircular_VerifyAnswer() {
        int[] nums = new int[]{3, -1, 2, -1};

        Assertions.assertThat(solution.maxSubarraySumCircular(nums))
                .isEqualTo(4);
    }

    @Test
    void maxSubarraySumCircular_VerifyAnswer2() {
        int[] nums = new int[]{5, -3, 5};

        Assertions.assertThat(solution.maxSubarraySumCircular(nums))
                .isEqualTo(10);
    }
}