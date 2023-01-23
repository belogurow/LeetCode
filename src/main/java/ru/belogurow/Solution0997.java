package ru.belogurow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/find-the-town-judge/">997. Find the Town Judge</a>
 * <p>
 * todo refactor to get better time
 */
public class Solution0997 {

    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0) {
            return n == 1 ? 1 : -1;
        }

        int[] trustCount = new int[n + 1];

        int maxTrustSetIdx = -1;
        Map<Integer, Set<Integer>> trustPersons = new HashMap<>();
        for (int[] ints : trust) {
            trustCount[ints[0]] += 1;
            trustPersons.computeIfAbsent(ints[1], k -> new HashSet<>()).add(ints[0]);

            if (trustPersons.get(ints[1]).size() > trustPersons.getOrDefault(maxTrustSetIdx, Set.of()).size()) {
                maxTrustSetIdx = ints[1];
            }

        }

        return (trustPersons.get(maxTrustSetIdx).size() == n - 1 && trustCount[maxTrustSetIdx] == 0) ?
                maxTrustSetIdx : -1;
    }

}
