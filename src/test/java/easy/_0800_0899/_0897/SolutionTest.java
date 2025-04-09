package easy._0800_0899._0897;

import easy.util.InOrderTreeNodeVisitor;
import easy.util.TreeNodeCollectorVisitorAction;
import org.junit.Test;
import util.TreeNode;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        TreeNode root1 = fromArray(new Integer[] { 5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9 });

        TreeNodeCollectorVisitorAction inOrderCollector1 = new TreeNodeCollectorVisitorAction(array1.length);
        root1.traverse(new InOrderTreeNodeVisitor(inOrderCollector1));

        assertArrayEquals(array1, inOrderCollector1.getArray());

        int[] array2 = new int[] { 1, 5, 7 };
        TreeNode root2 = fromArray(new Integer[] { 5, 1, 7 });

        TreeNodeCollectorVisitorAction inOrderCollector2 = new TreeNodeCollectorVisitorAction(array2.length);
        root2.traverse(new InOrderTreeNodeVisitor(inOrderCollector2));

        assertArrayEquals(array2, inOrderCollector2.getArray());
    }
}
