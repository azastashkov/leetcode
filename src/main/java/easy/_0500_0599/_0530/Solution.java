package easy._0500_0599._0530;

import util.TreeNode;

public class Solution {
    private int previous = -1 << 30;
    private int min = 1 << 30;

    public int getMinimumDifference(TreeNode root) {
        traverseInOrder(root);
        return min;
    }

    private void traverseInOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        traverseInOrder(node.left);

        min = Math.min(min, node.val - previous);

        previous = node.val;

        traverseInOrder(node.right);
    }
}
