package ru.belogurow;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @see <a href="https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/">2244. Minimum Rounds to Complete All Tasks</a>
 */
public class Solution2244 {

    public int minimumRounds(int[] tasks) {
        if (tasks.length == 1) {
            return -1;
        }

        Map<Integer, Long> freqMap = Arrays.stream(tasks)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int output = 0;
        for (Map.Entry<Integer, Long> entry : freqMap.entrySet()) {
            Long freq = entry.getValue();
            if (freq == 1) {
                return -1;
            }

            output += (freq % 3 == 0) ? freq / 3 : freq / 3 + 1;
        }

        return output;
    }
}
