package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1365Test {

    private final Solution1365 solution = new Solution1365();

    @Test
    void smallerNumbersThanCurrent_VerifyAnswer() {
        int[] input = new int[]{8, 1, 2, 2, 3, 8};

        Assertions.assertThat(solution.smallerNumbersThanCurrent(input))
                .containsExactly(4, 0, 1, 1, 3, 4);
    }
}