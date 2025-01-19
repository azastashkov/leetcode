package easy.util;

import util.TreeNode;

public class InOrderTreeNodeVisitor extends AbstractTreeNodeVisitor {
    public InOrderTreeNodeVisitor(TreeNodeVisitorAction action) {
        super(action);
    }

    @Override
    public void visit(TreeNode node) {
        if (node != null) {
            visit(node.left);
            action.accept(node);
            visit(node.right);
        }
    }
}
