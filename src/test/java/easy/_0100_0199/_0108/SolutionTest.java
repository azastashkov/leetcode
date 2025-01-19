package easy._0100_0199._0108;

import easy.util.InOrderTreeNodeVisitor;
import easy.util.TreeNodeCollectorVisitorAction;
import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] array1 = new int[] { -10, -3, 0, 5, 9 };
        TreeNode root1 = solution.sortedArrayToBST(array1);

        TreeNodeCollectorVisitorAction inOrderCollector1 = new TreeNodeCollectorVisitorAction(array1.length);
        root1.traverse(new InOrderTreeNodeVisitor(inOrderCollector1));

        assertArrayEquals(array1, inOrderCollector1.getArray());

        int[] array2 = new int[] { 1, 3 };
        TreeNode root2 = solution.sortedArrayToBST(array2);

        TreeNodeCollectorVisitorAction inOrderCollector2 = new TreeNodeCollectorVisitorAction(array2.length);
        root2.traverse(new InOrderTreeNodeVisitor(inOrderCollector2));

        assertArrayEquals(array2, inOrderCollector2.getArray());
    }
}
