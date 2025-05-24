package easy._2200_2299._2236;

import util.TreeNode;

public class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}