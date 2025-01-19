package easy._0100_0199._0100;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode p1 = fromArray(new Integer[] { 1, 2, 3 });
        TreeNode q1 = fromArray(new Integer[] { 1, 2, 3 });

        assertTrue(solution.isSameTree(p1, q1));

        TreeNode p2 = fromArray(new Integer[] { 1, 2 });
        TreeNode q2 = fromArray(new Integer[] { 1, null, 2 });

        assertFalse(solution.isSameTree(p2, q2));

        TreeNode p3 = fromArray(new Integer[] { 1, 2, 1 });
        TreeNode q3 = fromArray(new Integer[] { 1, 1, 2 });

        assertFalse(solution.isSameTree(p3, q3));
    }
}
