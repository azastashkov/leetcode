package easy._0800_0899._0872;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root11 = fromArray(new Integer[] { 3, 5, 1, 6, 2, 9, 8, null, null, 7, 4 });
        TreeNode root12 = fromArray(new Integer[] { 3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8 });

        assertTrue(solution.leafSimilar(root11, root12));

        TreeNode root21 = fromArray(new Integer[] { 1, 2, 3 });
        TreeNode root22 = fromArray(new Integer[] { 1, 3, 2 });

        assertFalse(solution.leafSimilar(root21, root22));
    }
}
