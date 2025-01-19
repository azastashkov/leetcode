package easy.util;

import util.TreeNode;

import java.util.function.Consumer;

public interface TreeNodeVisitorAction extends Consumer<TreeNode> {
    @Override
    default Consumer<TreeNode> andThen(Consumer<? super TreeNode> after) {
        return Consumer.super.andThen(after);
    }
}
