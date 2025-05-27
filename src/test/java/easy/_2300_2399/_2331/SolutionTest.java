package easy._2300_2399._2331;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 2, 1, 3, null, null, 0, 1 });

        assertTrue(solution.evaluateTree(root1));

        TreeNode root2 = fromArray(new Integer[] { 0 });

        assertFalse(solution.evaluateTree(root2));
    }
}
