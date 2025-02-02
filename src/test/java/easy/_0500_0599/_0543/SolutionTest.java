package easy._0500_0599._0543;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution1 = new Solution();
        TreeNode root1 = fromArray(new Integer[] { 1, 2, 3, 4, 5 });

        assertEquals(3, solution1.diameterOfBinaryTree(root1));

        Solution solution2 = new Solution();
        TreeNode root2 = fromArray(new Integer[] { 1, 2 });

        assertEquals(1, solution2.diameterOfBinaryTree(root2));
    }
}
