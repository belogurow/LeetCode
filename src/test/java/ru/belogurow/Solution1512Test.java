package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1512Test {

    private final Solution1512 solution = new Solution1512();

    @Test
    void numIdenticalPairs_VerifyAnswer() {
        int[] input = new int[]{1, 2, 3, 1, 1, 3};

        Assertions.assertThat(solution.numIdenticalPairs(input))
                .isEqualTo(4);
    }

    @Test
    void numIdenticalPairs_VerifyAnswer2() {
        int[] input = new int[]{1, 1, 1, 1};

        Assertions.assertThat(solution.numIdenticalPairs2(input))
                .isEqualTo(6);
    }
}