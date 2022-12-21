package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1470Test {

    private final Solution1470 solution = new Solution1470();

    @Test
    void shuffle_VerifyAnswer() {
        int[] input = new int[]{1, 2, 3, 4, 4, 3, 2, 1};

        Assertions.assertThat(solution.shuffle(input, 4))
                .containsExactly(1, 4, 2, 3, 3, 2, 4, 1);
    }

    @Test
    void shuffle_VerifyAnswer2() {
        int[] input = new int[]{2, 5, 1, 3, 4, 7};

        Assertions.assertThat(solution.shuffle(input, 3))
                .containsExactly(2, 3, 5, 4, 1, 7);
    }
}