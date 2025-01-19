package easy.util;

import util.TreeNode;

public class TreeNodeCollectorVisitorAction implements TreeNodeVisitorAction {
    private final int[] array;
    private int size;

    public TreeNodeCollectorVisitorAction(int capacity) {
        this.array = new int[capacity];
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(TreeNode node) {
        array[size++] = node.val;
    }
}
