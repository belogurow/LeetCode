package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0852Test {

    private final Solution0852 solution = new Solution0852();

    @Test
    void peakIndexInMountainArray_VerifyAnswer() {
        int[] input = new int[]{0, 1, 0};

        Assertions.assertThat(solution.peakIndexInMountainArray(input))
                .isEqualTo(1);
    }

    @Test
    void peakIndexInMountainArray_VerifyAnswer2() {
        int[] input = new int[]{40, 48, 61, 75, 100, 99, 98, 39, 30, 10};

        Assertions.assertThat(solution.peakIndexInMountainArray(input))
                .isEqualTo(4);
    }
}