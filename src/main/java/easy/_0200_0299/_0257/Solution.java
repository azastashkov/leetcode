package easy._0200_0299._0257;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<String> res = new LinkedList<>();
    private List<String> cur = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return null;
        }

        dfs(root);

        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        cur.add(Integer.toString(root.val));

        if (root.left == null && root.right == null) {
            res.add(String.join("->", cur));
        } else {
            dfs(root.left);
            dfs(root.right);
        }

        cur.remove(cur.size() - 1);
    }
}
