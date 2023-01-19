package ru.belogurow;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.belogurow.common.Node;

class Solution0589Test {

    @Test
    void preorder_Recursive_VerifyAnswer() {
        Solution0589.Recursive recursive = new Solution0589.Recursive();

        Assertions.assertThat(recursive.preorder(createTree()))
                .containsExactly(1, 3, 5, 6, 2, 4);
    }

    @Test
    void preorder_Iterative_VerifyAnswer() {
        Solution0589.Iterative iterative = new Solution0589.Iterative();

        Assertions.assertThat(iterative.preorder(createTree()))
                .containsExactly(1, 3, 5, 6, 2, 4);
    }

    private Node createTree() {
        return new Node(1, List.of(
                new Node(3, List.of(
                        new Node(5),
                        new Node(6))),
                new Node(2),
                new Node(4)));
    }
}