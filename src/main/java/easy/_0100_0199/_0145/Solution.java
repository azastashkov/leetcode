package easy._0100_0199._0145;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> values = new LinkedList<>();
        postorder(root, values);
        return values;
    }

    private void postorder(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }

        postorder(root.left, values);
        postorder(root.right, values);

        values.add(root.val);
    }
}
