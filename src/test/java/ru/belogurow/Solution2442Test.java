package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2442Test {

    private final Solution2442 solution = new Solution2442();

    @Test
    void countDistinctIntegers_VerifyAnswer() {
        int[] input = new int[]{1, 13, 10, 12, 31};

        Assertions.assertThat(solution.countDistinctIntegers(input))
                .isEqualTo(6);
    }
}