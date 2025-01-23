package easy._0200_0299._0226;

import easy.util.LevelOrderTreeNodeVisitor;
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

        Integer[] array1 = new Integer[] { 4, 2, 7, 1, 3, 6, 9 };
        TreeNode root1 = fromArray(array1);

        TreeNodeCollectorVisitorAction levelOrderCollector1 = new TreeNodeCollectorVisitorAction(array1.length);
        solution.invertTree(root1).traverse(new LevelOrderTreeNodeVisitor(levelOrderCollector1));

        assertArrayEquals(new int[] { 4, 7, 2, 9, 6, 3, 1 }, levelOrderCollector1.getArray());

        Integer[] array2 = new Integer[] { 2, 1, 3 };
        TreeNode root2 = fromArray(array2);

        TreeNodeCollectorVisitorAction levelOrderCollector2 = new TreeNodeCollectorVisitorAction(array2.length);
        solution.invertTree(root2).traverse(new LevelOrderTreeNodeVisitor(levelOrderCollector2));

        assertArrayEquals(new int[] { 2, 3, 1 }, levelOrderCollector2.getArray());

        assertNull(solution.invertTree(null));
    }
}
