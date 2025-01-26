package easy._0400_0499._0404;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 3, 9, 20, null, null, 15, 7 });

        assertEquals(24, solution.sumOfLeftLeaves(root1));

        TreeNode root2 = fromArray(new Integer[] { 1 });

        assertEquals(0, solution.sumOfLeftLeaves(root2));
    }
}
