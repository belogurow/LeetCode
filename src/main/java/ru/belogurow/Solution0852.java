package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/peak-index-in-a-mountain-array/">852. Peak Index in a Mountain Array</a>
 */
public class Solution0852 {

    public int peakIndexInMountainArray(int[] arr) {
        int first = 0, last = arr.length;
        int index = 0;

        do {
            index = first + (last - first) / 2;

            if (arr[index - 1] < arr[index]) {
                if (arr[index] > arr[index + 1]) {
                    return index;
                } else {
                    first = index;
                }
            } else {
                last = index;
            }
        } while (true);
    }
}
