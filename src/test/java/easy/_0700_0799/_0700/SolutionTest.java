package easy._0700_0799._0700;

import easy.util.PreOrderTreeNodeVisitor;
import easy.util.TreeNodeCollectorVisitorAction;
import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 4, 2, 7, 1, 3 });

        TreeNode search1 = solution.searchBST(root1, 2);
        int[] expected1 = new int[] { 2, 1, 3 };

        TreeNodeCollectorVisitorAction preOrderCollector1 = new TreeNodeCollectorVisitorAction(expected1.length);
        search1.traverse(new PreOrderTreeNodeVisitor(preOrderCollector1));

        assertArrayEquals(expected1, preOrderCollector1.getArray());

        assertNull(solution.searchBST(root1, 5));
    }
}
