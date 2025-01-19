package easy._0100_0199._0104;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 3, 9, 20, null, null, 15, 7 });
        assertEquals(3, solution.maxDepth(root1));

        TreeNode root2 = fromArray(new Integer[] { 1, null, 2 });
        assertEquals(2, solution.maxDepth(root2));
    }
}
