package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.belogurow.common.ListNode;


class Solution0328Test {

  private final Solution0328 solution = new Solution0328();

  @Test
  void oddEvenList_verifyAnswer() {
    ListNode head = ListNode.convertToNodes(1, 2, 3, 4, 5);

    Assertions.assertThat(solution.oddEvenList(head)
            .convertToList())
        .containsExactly(1, 3, 5, 2, 4);

  }
}