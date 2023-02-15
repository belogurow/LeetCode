package ru.belogurow;

import ru.belogurow.inheritance.VersionControl;

/**
 * @see <a href="https://leetcode.com/problems/first-bad-version/">278. First Bad Version</a>
 */
public class Solution0278 extends VersionControl {

	public Solution0278(int firstBadVersion) {
		super(firstBadVersion);
	}

	public int firstBadVersion(int n) {
		int left = 1, right = n;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (isBadVersion(mid)) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return left;
	}
}


