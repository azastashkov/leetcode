package easy._2300_2399._2331;

import util.TreeNode;

public class Solution {
    public boolean evaluateTree(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode node) {
        if (isLeaf(node)) {
            return node.val == 1;
        }

        boolean left;
        if (isLeaf(node.left)) {
            left = node.left.val == 1;
        } else {
            left = dfs(node.left);
        }

        boolean right;
        if (isLeaf(node.right)) {
            right = node.right.val == 1;
        } else {
            right = dfs(node.right);
        }

        if (node.val == 2) {
            return left || right;
        }

        return left && right;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}