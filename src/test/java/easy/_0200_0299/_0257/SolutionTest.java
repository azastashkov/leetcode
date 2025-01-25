package easy._0200_0299._0257;

import org.junit.Test;
import util.TreeNode;

import java.util.List;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution1 = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 1, 2, 3, null, 5 });
        List<String> res1 = solution1.binaryTreePaths(root1);

        assertEquals("1->2->5", res1.get(0));
        assertEquals("1->3", res1.get(1));

        Solution solution2 = new Solution();

        TreeNode root2 = fromArray(new Integer[] { 1 });
        List<String> res2 = solution2.binaryTreePaths(root2);

        assertEquals("1", res2.get(0));
    }
}
