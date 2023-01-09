package ru.belogurow;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">144. Binary Tree Preorder Traversal</a>
 */
public class Solution0144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        iterative(root, values);
        return values;
    }

    private void iterative(TreeNode node, List<Integer> values) {
        Stack<TreeNode> input = new Stack<>();
        input.push(node);

        while (!input.isEmpty()) {
            TreeNode nd = input.pop();
            if (nd != null) {
                values.add(nd.val);

                input.push(nd.right);
                input.push(nd.left);
            }
        }
    }

    private void recursive(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }

        values.add(node.val);
        recursive(node.left, values);
        recursive(node.right, values);
    }
}
