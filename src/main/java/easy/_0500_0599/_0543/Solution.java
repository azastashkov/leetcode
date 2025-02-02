package easy._0500_0599._0543;

import util.TreeNode;

public class Solution {
    private int d;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return d;
    }

    private int diameter(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int l = diameter(node.left);
        int r = diameter(node.right);

        d = Math.max(d, l + r);

        return 1 + Math.max(l, r);
    }
}
