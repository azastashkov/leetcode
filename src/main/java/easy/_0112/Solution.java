package easy._0112;

import util.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        int remainder = targetSum - root.val;
        if (root.left == null && root.right == null && remainder == 0) {
            return true;
        }

        return hasPathSum(root.left, remainder) || hasPathSum(root.right, remainder);
    }
}