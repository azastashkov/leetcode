package easy._0500_0599._0572;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 3, 4, 5, 1, 2 });
        TreeNode subRoot1 = fromArray(new Integer[] { 4, 1, 2 });

        assertTrue(solution.isSubtree(root1, subRoot1));

        TreeNode root2 = fromArray(new Integer[] { 3, 4, 5, 1, 2, null, null, null, null, 0 });
        TreeNode subRoot2 = fromArray(new Integer[] { 4, 1, 2 });

        assertFalse(solution.isSubtree(root2, subRoot2));
    }
}
