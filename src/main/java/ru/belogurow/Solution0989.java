package ru.belogurow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/add-to-array-form-of-integer/">989. Add to Array-Form of Integer</a>
 */
public class Solution0989 {

	public List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> res = new ArrayList<>();

		for (int i = num.length - 1; i >= 0 || k != 0; i--, k /= 10) {
			if (i >= 0) {
				k += num[i];
			}

			res.add(k % 10);
		}

		Collections.reverse(res);
		return res;
	}
}
