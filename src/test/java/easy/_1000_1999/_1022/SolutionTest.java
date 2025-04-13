package easy._1000_1999._1022;

import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 1, 0, 1, 0, 1, 0, 1 });

        assertEquals(22, solution.sumRootToLeaf(root1));

        assertEquals(0, solution.sumRootToLeaf(null));
    }
}
