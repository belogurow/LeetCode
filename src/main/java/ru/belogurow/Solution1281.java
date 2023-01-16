package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/">1281. Subtract the Product and Sum of Digits of an Integer</a>
 */
public class Solution1281 {

	public int subtractProductAndSum(int n) {
		int sumOfDigits = 0;
		int productOfDigits = 1;

		while (n != 0) {
			int digit = n % 10;
			sumOfDigits += digit;
			productOfDigits *= digit;
			n /= 10;
		}

		return productOfDigits - sumOfDigits;
	}
}
