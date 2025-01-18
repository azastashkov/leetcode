package easy._0108;

import org.junit.Test;
import util.TreeNode;

import java.util.List;
import java.util.LinkedList;

import static easy.util.TreeNodeUtil.inorder;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] array1 = new int[] { -10, -3, 0, 5, 9 };
        TreeNode root1 = solution.sortedArrayToBST(array1);
        List<Integer> list1 = new LinkedList<>();
        inorder(root1, list1::add);

        assertArrayEquals(array1, list1.stream().mapToInt(i -> i).toArray());

        int[] array2 = new int[] { 1, 3 };
        TreeNode root2 = solution.sortedArrayToBST(array2);
        List<Integer> list2 = new LinkedList<>();
        inorder(root2, list2::add);

        assertArrayEquals(array2, list2.stream().mapToInt(i -> i).toArray());
    }
}
