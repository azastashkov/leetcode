package easy._0100_0199._0110;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        Integer[] array1 = new Integer[] { 3, 9, 20, null, null, 15, 7 };
        TreeNode root1 = fromArray(array1);

        assertTrue(solution.isBalanced(root1));

        Integer[] array2 = new Integer[] { 1, 2, 2, 3, 3, null, null, 4, 4 };
        TreeNode root2 = fromArray(array2);

        assertFalse(solution.isBalanced(root2));

        Integer[] array3 = new Integer[] {};
        TreeNode root3 = fromArray(array3);

        assertTrue(solution.isBalanced(root3));

        Integer[] array4 = new Integer[] { 1, 2, 2, 3, null, null, 3, 4, null, null, 4 };
        TreeNode root4 = fromArray(array4);

        assertFalse(solution.isBalanced(root4));
    }
}
