package easy._0900_0999._0993;

import util.TreeNode;

public class Solution {
    private int xDepth = -1;
    private int yDepth = -1;
    private TreeNode xParent;
    private TreeNode yParent;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, x, y, 1, null);
        return xDepth == yDepth && xParent != yParent;
    }

    private void dfs(TreeNode node, int x, int y, int depth, TreeNode parent) {
        if (node == null || cousinsFound()) {
            return;
        }

        if (node.left != null) {
            dfs(node.left, x, y, depth + 1, node);
        }

        if (node.right != null) {
            dfs(node.right, x, y, depth + 1, node);
        }

        if (node.val == x) {
            xDepth = depth;
            xParent = parent;
        }

        if (node.val == y) {
            yDepth = depth;
            yParent = parent;
        }
    }

    private boolean cousinsFound() {
        return xDepth >= 0 && yDepth >= 0 && xParent != yParent;
    }
}