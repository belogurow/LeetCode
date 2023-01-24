package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1356Test {

    private final Solution1356 solution = new Solution1356();

    @Test
    void sortByBits_VerifyAnswer() {
        int[] arr = new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

        Assertions.assertThat(solution.sortByBits(arr))
                .containsExactly(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024);

    }
}