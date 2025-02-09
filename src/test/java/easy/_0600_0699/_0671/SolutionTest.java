package easy._0600_0699._0671;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution1 = new Solution();
        TreeNode root1 = fromArray(new Integer[] { 2, 2, 5, null, null, 5, 7 });

        assertEquals(5, solution1.findSecondMinimumValue(root1));

        Solution solution2 = new Solution();
        TreeNode root2 = fromArray(new Integer[] { 2, 2, 2 });

        assertEquals(-1, solution2.findSecondMinimumValue(root2));
    }
}
