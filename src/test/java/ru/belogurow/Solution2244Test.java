package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2244Test {

    private final Solution2244 solution = new Solution2244();

    @Test
    void minimumRounds_VerifyAnswer() {
        int[] input = new int[]{2, 2, 3, 3, 2, 4, 4, 4, 4, 4};

        Assertions.assertThat(solution.minimumRounds(input))
                .isEqualTo(4);
    }
}