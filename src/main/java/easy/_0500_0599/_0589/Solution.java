package easy._0500_0599._0589;

import util.Node;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
        traversePreorder(root, res);
        return res;
    }

    private void traversePreorder(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }

        res.add(root.val);

        for (Node child : root.children) {
            traversePreorder(child, res);
        }
    }
}
