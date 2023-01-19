package ru.belogurow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import ru.belogurow.common.Node;

/**
 * @see <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/">589. N-ary Tree Preorder Traversal</a>
 */
public abstract class Solution0589 {

    public abstract List<Integer> preorder(Node root);

    public static final class Recursive extends Solution0589 {

        @Override
        public List<Integer> preorder(Node root) {
            List<Integer> values = new ArrayList<>();
            dfs(root, values);
            return values;
        }

        private void dfs(Node node, List<Integer> values) {
            if (node == null) {
                return;
            }

            values.add(node.val);

            if (node.children == null) {
                return;
            }

            for (Node childNode : node.children) {
                dfs(childNode, values);
            }
        }
    }

    public static final class Iterative extends Solution0589 {

        @Override
        public List<Integer> preorder(Node root) {
            List<Integer> values = new ArrayList<>();
            if (root == null) {
                return values;
            }

            Deque<Node> nodeStack = new ArrayDeque<>();
            nodeStack.push(root);

            while (!nodeStack.isEmpty()) {
                Node node = nodeStack.pop();
                values.add(node.val);

                for (int i = node.children.size() - 1; i >= 0; i--) {
                    nodeStack.push(node.children.get(i));
                }
            }

            return values;
        }
    }
}
