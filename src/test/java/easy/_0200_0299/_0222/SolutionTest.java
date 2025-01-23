package easy._0200_0299._0222;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 1, 2, 3, 4, 5, 6 });

        assertEquals(6, solution.countNodes(root1));

        assertEquals(0, solution.countNodes(null));

        TreeNode root3 = fromArray(new Integer[] { 1 });

        assertEquals(1, solution.countNodes(root3));
    }
}
