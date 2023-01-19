package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0974Test {

    private final Solution0974 solution = new Solution0974();

    @Test
    void subarraysDivByK_VerifyAnswer() {
        int[] nums = new int[]{4, 5, 0, -2, -3, 1};

        Assertions.assertThat(solution.subarraysDivByK(nums, 5))
                .isEqualTo(7);
    }

    @Test
    void subarraysDivByK_VerifyAnswer2() {
        int[] nums = new int[]{-1, 2, 9};

        Assertions.assertThat(solution.subarraysDivByK(nums, 2))
                .isEqualTo(2);
    }

    @Test
    void subarraysDivByK_VerifyAnswer3() {
        int[] nums = new int[]{8, 9, 7, 8, 9};

        Assertions.assertThat(solution.subarraysDivByK(nums, 8))
                .isEqualTo(7);
    }
}