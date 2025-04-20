package easy._1300_1399._1379;

import util.TreeNode;

public class Solution {
    public final TreeNode getTargetCopy(
            final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return dfs(original, cloned, target);
    }

    private TreeNode dfs(TreeNode root1, TreeNode root2, TreeNode target) {
        if (root1 == null) {
            return null;
        }

        if (root1 == target) {
            return root2;
        }

        TreeNode res = dfs(root1.left, root2.left, target);

        return res == null ? dfs(root1.right, root2.right, target) : res;
    }
}