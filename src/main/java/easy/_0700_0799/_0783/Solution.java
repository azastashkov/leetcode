package easy._0700_0799._0783;

import util.TreeNode;

class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private int previousVal = Integer.MIN_VALUE;

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return minDiff;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.left);

        if (previousVal != Integer.MIN_VALUE) {
            minDiff = Math.min(minDiff, node.val - previousVal);
        }

        previousVal = node.val;

        dfs(node.right);
    }
}