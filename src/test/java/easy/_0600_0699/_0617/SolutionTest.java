package easy._0600_0699._0617;

import easy.util.LevelOrderTreeNodeVisitor;
import easy.util.TreeNodeCollectorVisitorAction;
import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root11 = fromArray(new Integer[] { 1, 3, 2, 5 });
        TreeNode root12 = fromArray(new Integer[] { 2, 1, 3, null, 4, null, 7 });

        TreeNode result11 = solution.mergeTrees(root11, root12);

        TreeNodeCollectorVisitorAction levelOrderCollector1 = new TreeNodeCollectorVisitorAction(6);
        result11.traverse(new LevelOrderTreeNodeVisitor(levelOrderCollector1));

        assertArrayEquals(new int[] { 3, 4, 5, 5, 4, 7 }, levelOrderCollector1.getArray());

        TreeNode root21 = fromArray(new Integer[] { 1 });
        TreeNode root22 = fromArray(new Integer[] { 1, 2 });

        TreeNode result21 = solution.mergeTrees(root21, root22);

        TreeNodeCollectorVisitorAction levelOrderCollector2 = new TreeNodeCollectorVisitorAction(2);
        result21.traverse(new LevelOrderTreeNodeVisitor(levelOrderCollector2));

        assertArrayEquals(new int[] { 2, 2 }, levelOrderCollector2.getArray());
    }
}
