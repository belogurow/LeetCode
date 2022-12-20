package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1920Test {

    private final Solution1920 solution = new Solution1920();

    @Test
    void buildArray_VerifyAnswer() {
        int[] input = new int[]{5, 0, 1, 2, 3, 4};

        Assertions.assertThat(solution.buildArray(input))
                .containsExactly(4, 5, 0, 1, 2, 3);
    }
}