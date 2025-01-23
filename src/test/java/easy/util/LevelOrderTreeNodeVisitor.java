package easy.util;

import util.TreeNode;

import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTreeNodeVisitor extends AbstractTreeNodeVisitor {
    public LevelOrderTreeNodeVisitor(TreeNodeVisitorAction action) {
        super(action);
    }

    @Override
    public void visit(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            action.accept(node);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
