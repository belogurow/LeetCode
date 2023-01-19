package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/subarray-sums-divisible-by-k/">974. Subarray Sums Divisible by K</a>
 */
public class Solution0974 {

    public int subarraysDivByK(int[] nums, int k) {
        int[] modCount = new int[k];
        modCount[0] = 1; // if we get only one 0 => we already have one subarray div by k

        int count = 0, prefixMod = 0;
        for (int num : nums) {
            prefixMod = (prefixMod + num) % k;
            prefixMod = prefixMod < 0 ? prefixMod + k : prefixMod;

            count += modCount[prefixMod];
            modCount[prefixMod]++;
        }

        return count;
    }
}
