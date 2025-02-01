package easy._0500_0599._0501;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 1, null, 2, 2 });

        assertArrayEquals(new int[] { 2 }, solution.findMode(root1));

        TreeNode root2 = fromArray(new Integer[] { null });

        assertArrayEquals(new int[] {}, solution.findMode(root2));
    }
}
