package easy.util;

import util.TreeNode;

import java.util.Queue;
import java.util.ArrayDeque;

public class TreeNodeUtil {
    public static TreeNode fromArray(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) {
            return new TreeNode();
        }

        TreeNode root = new TreeNode(values[0]);

        Queue<TreeNode> queue = new ArrayDeque<>(values.length);
        queue.add(root);

        int valPtr = 1;
        while (!queue.isEmpty()) {
            Integer leftVal = valPtr < values.length ? values[valPtr++] : null;
            Integer rightVal = valPtr < values.length ? values[valPtr++] : null;

            TreeNode node = queue.remove();

            if (leftVal != null) {
                TreeNode leftNode = new TreeNode(leftVal);
                node.left = leftNode;
                queue.add(leftNode);
            }

            if (rightVal != null) {
                TreeNode rightNode = new TreeNode(rightVal);
                node.right = rightNode;
                queue.add(rightNode);
            }
        }

        return root;
    }
}
