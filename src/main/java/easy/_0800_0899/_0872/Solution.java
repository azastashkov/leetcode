package easy._0800_0899._0872;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs1 = new LinkedList<>();
        dfs(root1, leafs1);

        List<Integer> leafs2 = new LinkedList<>();
        dfs(root2, leafs2);

        return leafs1.equals(leafs2);
    }

    private void dfs(TreeNode node, List<Integer> leafs) {
        if (node == null) {
            return;
        }

        if (isLeaf(node)) {
            leafs.add(node.val);
            return;
        }

        if (node.left != null) {
            dfs(node.left, leafs);
        }

        if (node.right != null) {
            dfs(node.right, leafs);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}