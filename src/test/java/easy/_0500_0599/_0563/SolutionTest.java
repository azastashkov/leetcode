package easy._0500_0599._0563;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution1 = new Solution();
        TreeNode root1 = fromArray(new Integer[] { 1, 2, 3 });

        assertEquals(1, solution1.findTilt(root1));

        Solution solution2 = new Solution();
        TreeNode root2 = fromArray(new Integer[] { 4, 2, 9, 3, 5, null, 7 });

        assertEquals(15, solution2.findTilt(root2));

        Solution solution3 = new Solution();
        TreeNode root3 = fromArray(new Integer[] { 21, 7, 14, 1, 1, 2, 2, 3, 3 });

        assertEquals(9, solution3.findTilt(root3));
    }
}
