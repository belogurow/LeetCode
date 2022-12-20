package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/">2011. Final Value of Variable After Performing Operations</a>
 */
public class Solution2011 {

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            result += (operation.charAt(1) == '+') ? 1 : -1;
        }

        return result;
    }

}
