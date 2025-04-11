package easy._0900_0999._0938;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 10, 5, 15, 3, 7, null, 18 });

        assertEquals(32, solution.rangeSumBST(root1, 7, 15));

        TreeNode root2 = fromArray(new Integer[] { 10, 5, 15, 3, 7, 13, 18, 1, null, 6 });

        assertEquals(23, solution.rangeSumBST(root2, 6, 10));
    }
}
