package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/">108. Convert Sorted Array to Binary Search Tree</a>
 */
public class Solution0108 {

  public TreeNode sortedArrayToBST(int[] nums) {
    return BST(nums, 0, nums.length - 1);
  }

  private TreeNode BST(int[] nums, int l, int r) {
    if (l > r) {
      return null;
    }

    int mid = (l + r) / 2;
    TreeNode left = BST(nums, l, mid - 1);
    TreeNode right = BST(nums, mid + 1, r);

    return new TreeNode(nums[mid], left, right);
  }
}
