package easy._0600_0699._0653;

import util.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> vals = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            int b = k - node.val;
            if (vals.contains(b)) {
                return true;
            }

            vals.add(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return false;
    }
}
