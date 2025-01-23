package easy.util;

import util.TreeNode;

public class PostOrderTreeNodeVisitor extends AbstractTreeNodeVisitor {
    public PostOrderTreeNodeVisitor(TreeNodeVisitorAction action) {
        super(action);
    }

    @Override
    public void visit(TreeNode node) {
        if (node != null) {
            visit(node.left);
            visit(node.right);
            action.accept(node);
        }
    }
}
