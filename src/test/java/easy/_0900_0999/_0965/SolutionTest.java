package easy._0900_0999._0965;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 1, 1, 1, 1, 1, null, 1 });

        assertTrue(solution.isUnivalTree(root1));

        TreeNode root2 = fromArray(new Integer[] { 2, 2, 2, 5, 2 });

        assertFalse(solution.isUnivalTree(root2));
    }
}
