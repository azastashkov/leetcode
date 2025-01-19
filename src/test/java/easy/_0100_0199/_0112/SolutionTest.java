package easy._0100_0199._0112;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        Integer[] array1 = new Integer[] { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
        TreeNode root1 = fromArray(array1);

        assertTrue(solution.hasPathSum(root1, 22));

        Integer[] array2 = new Integer[] { 1, 2 ,3 };
        TreeNode root2 = fromArray(array2);

        assertFalse(solution.hasPathSum(root2, 5));

        Integer[] array3 = new Integer[] { };
        TreeNode root3 = fromArray(array3);

        assertFalse(solution.hasPathSum(root3, 0));

        Integer[] array4 = new Integer[] { 1, 2 };
        TreeNode root4 = fromArray(array4);

        assertFalse(solution.hasPathSum(root4, 1));
    }
}
