package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/valid-mountain-array/">941. Valid Mountain Array</a>
 */
public class Solution0941 {

	public boolean validMountainArray(int[] arr) {
		if (arr.length < 3) {
			return false;
		}

		boolean increase = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				return false;
			}

			if (arr[i] > arr[i - 1]) {
				if (!increase) {
					return false;
				}

				continue;
			}

			if (arr[i] < arr[i - 1]) {
				if (i == 1) {
					return false;
				}

				if (increase) {
					increase = false;
				}
			}
		}

		return !increase;
	}
}
