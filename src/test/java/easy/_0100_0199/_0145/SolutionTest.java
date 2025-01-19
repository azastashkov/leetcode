package easy._0100_0199._0145;

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

        TreeNode root1 = fromArray(new Integer[] { 1, null, 2, 3 } );
        List<Integer> list1 = Arrays.asList(3, 2, 1);

        assertEquals(list1, solution.postorderTraversal(root1));

        TreeNode root2 = fromArray(new Integer[] { 1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9 } );
        List<Integer> list2 = Arrays.asList(4 ,6, 7, 5, 2, 9, 8, 3, 1);

        assertEquals(list2, solution.postorderTraversal(root2));

        TreeNode root3 = fromArray(new Integer[] {} );
        List<Integer> list3 = Collections.emptyList();

        assertEquals(list3, solution.postorderTraversal(root3));

        TreeNode root4 = fromArray(new Integer[] { 1 } );
        List<Integer> list4 = Collections.singletonList(1);

        assertEquals(list4, solution.postorderTraversal(root4));
    }
}
