package ru.belogurow;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/max-points-on-a-line/">149. Max Points on a Line</a>
 */
public class Solution0149 {

    public int maxPoints(int[][] points) {
        int len = points.length;
        if (len == 1) {
            return 1;
        }

        int maxPointsOnLine = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            Map<Double, Integer> arctgWithPointCount = new HashMap<>();
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }

                Double arctg = Math.atan2(points[j][1] - points[i][1], points[j][0] - points[i][0]);
                arctgWithPointCount.compute(arctg, (k, v) -> (v == null) ? 1 : v + 1);
            }

            maxPointsOnLine = Math.max(maxPointsOnLine, Collections.max(arctgWithPointCount.values()) + 1);
        }

        return maxPointsOnLine;
    }
}
