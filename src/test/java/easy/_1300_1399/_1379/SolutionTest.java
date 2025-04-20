package easy._1300_1399._1379;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root11 = fromArray(new Integer[] { 7, 4, 3, null, null, 6, 19 });
        TreeNode root12 = fromArray(new Integer[] { 7, 4, 3, null, null, 6, 19 });

        assertEquals(3, solution.getTargetCopy(root11, root12, root11.right).val);

        TreeNode root21 = fromArray(new Integer[] { 7 });
        TreeNode root22 = fromArray(new Integer[] { 7 });

        assertEquals(7, solution.getTargetCopy(root21, root22, root21).val);

        TreeNode root31 = fromArray(new Integer[] { 8, null, 6, null, 5, null, 4, null, 3, null, 2, null, 1 });
        TreeNode root32 = fromArray(new Integer[] { 8, null, 6, null, 5, null, 4, null, 3, null, 2, null, 1 });

        assertEquals(4, solution.getTargetCopy(root31, root32, root31.right.right.right).val);
    }
}
