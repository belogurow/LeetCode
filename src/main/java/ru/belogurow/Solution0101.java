package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/symmetric-tree/">101. Symmetric Tree</a>
 *
 * todo try iterative method
 */
public class Solution0101 {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricRecursive(root.left, root.right);
    }

    private boolean isSymmetricRecursive(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSymmetricRecursive(p.left, q.right) && isSymmetricRecursive(p.right, q.left);
    }

}
