package easy.util;

import util.TreeNodeVisitor;

public abstract class AbstractTreeNodeVisitor implements TreeNodeVisitor {
    protected final TreeNodeVisitorAction action;

    public AbstractTreeNodeVisitor(TreeNodeVisitorAction action) {
        this.action = action;
    }
}
