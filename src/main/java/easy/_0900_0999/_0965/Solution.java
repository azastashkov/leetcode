package easy._0900_0999._0965;

import util.TreeNode;

public class Solution {
    private boolean univalued = true;

    public boolean isUnivalTree(TreeNode root) {
        bfs(root, root.val);
        return univalued;
    }

    private void bfs(TreeNode node, int val) {
        if (node == null || !univalued) {
            return;
        }

        if (node.val != val) {
            univalued = false;
        }

        if (node.left != null) {
            bfs(node.left, val);
        }

        if (node.right != null) {
            bfs(node.right, val);
        }
    }
}