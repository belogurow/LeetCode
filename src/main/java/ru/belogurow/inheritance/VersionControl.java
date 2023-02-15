package ru.belogurow.inheritance;

public class VersionControl {

	private final int firstBadVersion;

	public VersionControl(int firstBadVersion) {
		this.firstBadVersion = firstBadVersion;
	}

	public boolean isBadVersion(int n) {
		return n >= this.firstBadVersion;
	}
}
