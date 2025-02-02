package easy._0500_0599._0530;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution1 = new Solution();
        TreeNode root1 = fromArray(new Integer[] { 4, 2, 6, 1, 3 });

        assertEquals(1, solution1.getMinimumDifference(root1));

        Solution solution2 = new Solution();
        TreeNode root2 = fromArray(new Integer[] { 1, 0, 48, null, null, 12, 49 });

        assertEquals(1, solution2.getMinimumDifference(root2));
    }
}
