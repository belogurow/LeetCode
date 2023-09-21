package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/maximum-binary-tree/">654. Maximum Binary Tree</a>
 */
public class Solution0654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return createSubTree(nums, 0, nums.length);
    }

    private TreeNode createSubTree(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }

        int maxNumIdx = l;

        for (int i = l; i < r; i++) {
            if (nums[i] >= nums[maxNumIdx]) {
                maxNumIdx = i;
            }
        }

        return new TreeNode(nums[maxNumIdx], createSubTree(nums, l, maxNumIdx), createSubTree(nums, maxNumIdx + 1, r));
    }
}
