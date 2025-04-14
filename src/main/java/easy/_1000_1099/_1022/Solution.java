package easy._1000_1099._1022;

import util.TreeNode;

public class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int shift) {
        if (node == null) {
            return 0;
        }

        shift = shift << 1 | node.val;

        int left = dfs(node.left, shift);
        int right = dfs(node.right, shift);

        if (node.left == null && node.right == null) {
            return shift;
        }

        return left + right;
    }
}