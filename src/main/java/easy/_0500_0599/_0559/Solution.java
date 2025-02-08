package easy._0500_0599._0559;

import util.Node;

public class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int max = 0;
        for (Node child : root.children) {
            max = Math.max(max, maxDepth(child));
        }

        return 1 + max;
    }
}
