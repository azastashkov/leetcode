package easy._0500_0599._0590;

import util.Node;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new LinkedList<>();
        traversePostorder(root, res);
        return res;
    }

    private void traversePostorder(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }

        for (Node child : root.children) {
            traversePostorder(child, res);
        }

        res.add(root.val);
    }
}
