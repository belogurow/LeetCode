package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class Solution0976Test {

    private final Solution0976 solution = new Solution0976();

    @Test
    void largestPerimeter_VerifyAnswer() {
        int[] nums = {2, 1, 2};
        Assertions.assertThat(solution.largestPerimeter(nums))
                .isEqualTo(5);
    }

    @Test
    void largestPerimeter_VerifyAnswer2() {
        int[] nums = {1, 2, 1, 10};
        Assertions.assertThat(solution.largestPerimeter(nums))
                .isEqualTo(0);
    }
}