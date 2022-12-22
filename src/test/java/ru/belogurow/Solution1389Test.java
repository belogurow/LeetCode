package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1389Test {

    private final Solution1389 solution = new Solution1389();

    @Test
    void createTargetArray_VerifyAnswer() {
        int[] input = new int[]{0, 1, 2, 3, 4};
        int[] indexex = new int[]{0, 1, 2, 2, 1};

        Assertions.assertThat(solution.createTargetArray(input, indexex))
                .containsExactly(0, 4, 1, 3, 2);
    }
}