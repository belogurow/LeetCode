package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/leaf-similar-trees/">872. Leaf-Similar Trees</a>
 */
public class Solution0872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs1 = new ArrayList<>();
        List<Integer> leafs2 = new ArrayList<>();

        dfs(root1, leafs1);
        dfs(root2, leafs2);

        return leafs1.equals(leafs2);
    }

    private void dfs(TreeNode root, List<Integer> leafs) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leafs.add(root.val);
            return;
        }


        dfs(root.left, leafs);
        dfs(root.right, leafs);

    }
}
