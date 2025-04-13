package easy._0900_0999._0993;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution1 = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 1, 2, 3, 4 });

        assertFalse(solution1.isCousins(root1, 4, 3));

        Solution solution2 = new Solution();

        TreeNode root2 = fromArray(new Integer[] { 1, 2, 3, null, 4, null, 5 });

        assertTrue(solution2.isCousins(root2, 5, 4));

        Solution solution3 = new Solution();

        TreeNode root3 = fromArray(new Integer[] { 1, 2, 3, null, 4 });

        assertFalse(solution3.isCousins(root3, 2, 3));
    }
}
