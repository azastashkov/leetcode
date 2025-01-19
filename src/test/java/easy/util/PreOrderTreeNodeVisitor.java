package easy.util;

import util.TreeNode;

public class PreOrderTreeNodeVisitor extends AbstractTreeNodeVisitor {
    public PreOrderTreeNodeVisitor(TreeNodeVisitorAction action) {
        super(action);
    }

    @Override
    public void visit(TreeNode node) {
        if (node != null) {
            action.accept(node);
            visit(node.left);
            visit(node.right);
        }
    }
}
