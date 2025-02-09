package easy._0600_0699._0653;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 5, 3, 6, 2, 4, null, 7 });

        assertTrue(solution.findTarget(root1, 9));

        TreeNode root2 = fromArray(new Integer[] { 5, 3, 6, 2, 4, null, 7 });

        assertFalse(solution.findTarget(root2, 28));

        TreeNode root3 = fromArray(new Integer[] { 2, 1, 3 });

        assertTrue(solution.findTarget(root3, 4));
    }
}
