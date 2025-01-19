package easy._0100_0199._0101;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 1, 2, 2, 3, 4, 4, 3 });
        assertTrue(solution.isSymmetric(root1));

        TreeNode root2 = fromArray(new Integer[] { 1, 2, 2, null, 3, null, 3 });
        assertFalse(solution.isSymmetric(root2));
    }
}
