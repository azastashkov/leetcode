package easy._0100_0199._0111;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        Integer[] array1 = new Integer[] { 3, 9, 20, null, null, 15, 7 };
        TreeNode root1 = fromArray(array1);

        assertEquals(2, solution.minDepth(root1));

        Integer[] array2 = new Integer[] { 2, null, 3, null, 4, null, 5, null, 6 };
        TreeNode root2 = fromArray(array2);

        assertEquals(5, solution.minDepth(root2));
    }
}
