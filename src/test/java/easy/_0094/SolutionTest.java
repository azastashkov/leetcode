package easy._0094;

import org.junit.Test;
import util.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 1, null, 2, 3 });
        List<Integer> expected1 = Arrays.asList(1, 3, 2);

        assertEquals(expected1, solution.inorderTraversal(root1));

        TreeNode root2 = fromArray(new Integer[] { 1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9 });
        List<Integer> expected2 = Arrays.asList(4, 2, 6, 5, 7, 1, 3, 9, 8);

        assertEquals(expected2, solution.inorderTraversal(root2));

        assertEquals(Collections.emptyList(), solution.inorderTraversal(null));

        TreeNode root4 = fromArray(new Integer[] { 1 });
        List<Integer> expected4 = Collections.singletonList(1);

        assertEquals(expected4, solution.inorderTraversal(root4));
    }
}
