package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0944Test {

    private final Solution0944 solution = new Solution0944();

    @Test
    void minDeletionSize_VerifyAnswer() {
        String[] input = new String[]{"cba", "daf", "ghi"};

        Assertions.assertThat(solution.minDeletionSize(input))
                .isEqualTo(1);
    }
}