package util;

public class TreeNode implements TreeNodeTraversable {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public void traverse(TreeNodeVisitor visitor) {
        visitor.visit(this);
    }
}
