package ru.belogurow;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/">2442. Count Number of Distinct Integers After Reverse Operations</a>
 */
public class Solution2442 {

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> distinctNums = new HashSet<>();

        for (int num : nums) {
            distinctNums.add(num);
            distinctNums.add(reverseNum(num));
        }

        return distinctNums.size();
    }

    private int reverseNum(int num) {
        int reverseNum = 0;

        while (num != 0) {
           reverseNum = reverseNum * 10 + num % 10;
           num = num / 10;
        }

        return reverseNum;
    }
}
