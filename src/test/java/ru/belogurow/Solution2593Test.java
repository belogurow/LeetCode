package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2593Test {

    private final Solution2593 solution = new Solution2593();

    @Test
    public void findScore() {
        int[] nums = new int[]{2, 1, 3, 4, 5, 2};
        Assertions.assertThat(solution.findScore(nums))
                .isEqualTo(7);
    }

    @Test
    public void findScore2() {
        int[] nums = new int[]{3, 2, 3, 1, 5, 2};
        Assertions.assertThat(solution.findScore(nums))
                .isEqualTo(5);
    }

}