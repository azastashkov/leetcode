package easy._0900_0999._0938;

import util.TreeNode;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int left = rangeSumBST(root.left, low, high);

        int val = root.val >= low && root.val <= high ? root.val : 0;

        int right = rangeSumBST(root.right, low, high);

        return left + val + right;
    }
}