package easy._0100_0199._0144;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new LinkedList<>();
        preorder(root, values);
        return values;
    }

    private void preorder(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }

        values.add(root.val);

        preorder(root.left, values);
        preorder(root.right, values);
    }
}