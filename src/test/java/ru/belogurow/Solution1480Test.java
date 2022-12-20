package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1480Test {

    private final Solution1480 solution = new Solution1480();

    @Test
    void runningSum_VerifyAnswer() {
        int[] input = new int[]{3, 1, 2, 10, 1};

        Assertions.assertThat(solution.runningSum(input))
                .containsExactly(3, 4, 6, 16, 17);
    }
}