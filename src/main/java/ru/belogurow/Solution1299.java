package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">1299. Replace Elements with Greatest Element on Right Side</a>
 */
public class Solution1299 {

	public int[] replaceElements(int[] arr) {
		int max = -1;

		for (int i = arr.length - 1; i >= 0; i--) {
			int elem = arr[i];
			arr[i] = max;
			max = Math.max(max, elem);
		}

		return arr;
	}
}
