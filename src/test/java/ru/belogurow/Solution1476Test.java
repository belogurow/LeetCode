package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1476Test {

    @Test
    void updateSubrectangle_VerifyAnswer() {
        Solution1476.SubrectangleQueries subrectangleQueries = new Solution1476.SubrectangleQueries(
                new int[][]{{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}});

        assertThat(subrectangleQueries.getValue(0, 2))
                .isEqualTo(1);

        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);

        assertThat(subrectangleQueries.getValue(0, 2))
                .isEqualTo(5);
        assertThat(subrectangleQueries.getValue(3, 1))
                .isEqualTo(5);

        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);

        assertThat(subrectangleQueries.getValue(3, 1))
                .isEqualTo(10);
        assertThat(subrectangleQueries.getValue(0, 2))
                .isEqualTo(5);
    }
}