package easy._0500_0599._0501;

import util.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private int maxFrequency;
    private int currentCount;
    private TreeNode previousNode;
    private List<Integer> modes;

    public int[] findMode(TreeNode root) {
        modes = new LinkedList<>();

        inorderTraversal(root);

        int[] result = new int[modes.size()];
        int i = 0;
        for (Integer mode : modes) {
            result[i++] = mode;
        }

        return result;
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);

        currentCount = (previousNode != null && previousNode.val == node.val) ? currentCount + 1 : 1;

        if (currentCount > maxFrequency) {
            maxFrequency = currentCount;
            modes = new LinkedList<>(Collections.singleton(node.val));
        } else if (currentCount == maxFrequency) {
            modes.add(node.val);
        }

        previousNode = node;

        inorderTraversal(node.right);
    }
}
