package easy._0500_0599._0563;

import util.TreeNode;

public class Solution {
    private int tilt;

    public int findTilt(TreeNode root) {
        dfs(root);
        return tilt;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int l = dfs(node.left);
        int r = dfs(node.right);

        tilt += Math.abs(l - r);

        return l + r + node.val;
    }
}
