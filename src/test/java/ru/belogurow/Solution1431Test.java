package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1431Test {

    private final Solution1431 solution = new Solution1431();

    @Test
    void kidsWithCandies_VerifyAnswer() {
        int[] input = new int[]{2, 3, 5, 1, 3};

        Assertions.assertThat(solution.kidsWithCandies(input, 3))
                .containsExactly(true, true, true, false, true);
    }
}