package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/add-binary/">67. Add Binary</a>
 */
public class Solution0067 {

	public String addBinary(String a, String b) {
		StringBuilder res = new StringBuilder();

		int carryIn = 0;
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
			int aNum = 0, bNum = 0, curNum = 0;

			if (i < 0) {
				bNum = b.charAt(j) - '0';
			} else if (j < 0) {
				aNum = a.charAt(i) - '0';
			} else {
				aNum = a.charAt(i) - '0';
				bNum = b.charAt(j) - '0';
			}

			curNum = aNum ^ bNum ^ carryIn;
			if ((aNum ^ bNum) == 0) {
				carryIn = aNum | bNum;
			}

			res.append(curNum);
		}

		if (carryIn == 1) {
			res.append(carryIn);
		}

		return res.reverse().toString();
	}
}
