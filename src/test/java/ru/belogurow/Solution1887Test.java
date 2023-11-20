package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution1887Test {

    private final Solution1887 solution = new Solution1887();

    @Test
    void verifyAnswer() {
        final int[] nums = new int[] {5, 1, 3};

        assertThat(solution.reductionOperations(nums))
                .isEqualTo(3);
    }

    @Test
    void verifyAnswer2() {
        final int[] nums = new int[] {2, 3, 2, 2, 2};

        assertThat(solution.reductionOperations(nums))
                .isEqualTo(1);
    }
}