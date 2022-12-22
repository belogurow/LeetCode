package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1313Test {

    private final Solution1313 solution = new Solution1313();

    @Test
    void decompressRLElist_VerifyAnswer() {
        int[] input = new int[]{1, 2, 3, 4};

        Assertions.assertThat(solution.decompressRLElist(input))
                .containsExactly(2, 4, 4, 4);
    }
}