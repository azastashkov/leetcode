package easy._0001_0099._0094;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        inorder(root, l::add);
        return l;
    }

    private void inorder(TreeNode root, Consumer<Integer> consumer) {
        if (root == null) {
            return;
        }

        inorder(root.left, consumer);
        consumer.accept(root.val);
        inorder(root.right, consumer);

    }
}
