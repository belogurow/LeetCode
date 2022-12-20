package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2011Test {

    private final Solution2011 solution = new Solution2011();

    @Test
    void finalValueAfterOperations_VerifyAnswer() {
        String[] input = new String[]{"X++", "++X", "--X", "X--"};

        Assertions.assertThat(solution.finalValueAfterOperations(input))
                .isEqualTo(0);
    }
}