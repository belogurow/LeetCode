package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1450Test {

    private final Solution1450 solution = new Solution1450();

    @Test
    void busyStudent_VerifyAnswer() {
        int[] startTime = new int[]{1, 2, 3};
        int[] endTime = new int[]{3, 2, 7};

        Assertions.assertThat(solution.busyStudent(startTime, endTime, 4))
                .isEqualTo(1);
    }
}